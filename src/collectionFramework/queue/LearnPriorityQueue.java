package collectionFramework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 In Java, PriorityQueue is a class that implements the Queue interface. PriorityQueue orders its elements based on their natural ordering or by a specified Comparator.

In this example we have created a PriortyQueue of patients such that patients will be given priorty in admitting hospital
based on their severity (health seriousness). We have created Patient Class which have name and severity of patient.
Let say, Severity as integer value, the larger the integer the greater will be severity of patient.
*/

// Patient class representing a patient with severity as priority
class Patient {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", severity=" + severity +
                '}';
    }
}

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Create a custom comparator to order patients by severity in descending order
        Comparator<Patient> severityComparator = Comparator.comparingInt(Patient::getSeverity).reversed();

        // Create a PriorityQueue with custom comparator
        PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>(severityComparator);

        // Add patients to the hospital queue
        hospitalQueue.add(new Patient("John", 3));
        hospitalQueue.add(new Patient("Alice", 5));
        hospitalQueue.add(new Patient("Bob", 2));

        // Print the patients in the hospital queue
        while (!hospitalQueue.isEmpty()) {
            System.out.println("Admitting: " + hospitalQueue.poll());
        }
    }
}
