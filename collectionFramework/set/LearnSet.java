package collectionFramework.set;

import java.util.HashSet;
import java.util.Set;

/*
 * A Set is an interface that represents a collection of elements where each element is unique. It doesn't store
 * the elements in natural order of adding because it store hash of the element/object.
 * That's why we can't refer to any particular index.
 */

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // HashSet doesn't maintain order of elements in which they were added

        /*
         * Set<Integer> set = new LinkedHashSet<>();
         * Only difference from HashSet, LinkedHashSet maintains order of elements in
         * which they were added
         * 
         * 
         * Set<Integer> set = new TreeSet<>();
         * TreeSet class in set interface stores elements in sorted order only as it
         * implements binarySearchTree.
         * In TreeSet adding, removing, searching all operations takes log(n) due to
         * BinarySearchTree behind the scene.
         */

        set.add(32);
        set.add(32);
        set.add(15);
        set.add(90);
        set.add(25);
        set.add(10);
        set.add(15);

        System.out.println(set);

        set.remove(32);
        System.out.println(set);
        System.out.println(set.contains(32));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

        /*
         * Now, let's have an example of student's class object as elements in set. And
         * we wanted to store only
         * unique students in set. So if try to add object of same roll number it
         * shouldn't be added in set.
         * Behind the scene Set uses equals method to check elements should be unique.
         * So we wanted to store
         * unique roll number students so we have to override equals method of Student
         * class which will help set to
         * store unqiue students.
         */

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));
        studentSet.add(new Student("Rohit", 2)); // same roll number as Anuj so it will not add

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(studentSet);
        System.out.println(s1.equals(s2));

    }
}