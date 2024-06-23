package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.*;;

class Student {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class StableCountingSort {

    public static List<Student> countingSort(List<Student> students) {
        int maxMarks = Integer.MIN_VALUE;

        // Find the maximum marks
        for (Student student : students) {
            if (student.marks > maxMarks) {
                maxMarks = student.marks;
            }
        }

        // Create a counting array to store frequency of each mark
        int[] countingArr = new int[maxMarks + 1];
        Arrays.fill(countingArr, 0);

        // Count occurrences of each mark
        for (Student student : students) {
            countingArr[student.marks]++;
        }

        // Create a student output array (pre-allocate space for stability)
        List<Student> sortedStudents = new ArrayList<>(students.size());
        for (int i = 0; i < students.size(); i++) {
            sortedStudents.add(null); // Pre-fill with null values
        }

        // Build the output array directly based on counts
        int index = 0;
        for (int mark = 0; mark <= maxMarks; mark++) {
            while (countingArr[mark] > 0) {
                for (Student student : students) {
                    if (student.marks == mark) {
                        sortedStudents.set(index, new Student(mark, student.name));
                        index++;
                        countingArr[mark]--;
                    }
                }
                countingArr[mark]--;
            }
        }

        return sortedStudents;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(75, "Alice"));
        students.add(new Student(68, "Bob"));
        students.add(new Student(68, "Charlie"));
        students.add(new Student(90, "David"));
        students.add(new Student(68, "Eve"));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student.marks + " - " + student.name);
        }

        List<Student> sortedStudents = countingSort(students);

        System.out.println("\nSorted List (Stable for same marks):");
        for (Student student : sortedStudents) {
            System.out.println(student.marks + " - " + student.name);
        }
    }
}