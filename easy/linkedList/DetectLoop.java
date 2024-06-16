//Link - https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/

import java.util.HashSet;

public class DetectLoop {

    /*
     * Detect a loop in a Ll- Using HashSet
     * Time Complexity - O(n) and Space Complexity - O(n)
     */
    public static boolean detectLoopByHS(Node h) {
        if (h == null) // means the list is null
            return false;

        HashSet<Node> HS = new HashSet<>();

        while (h != null) { // it will run until head not equal to null
            if (HS.contains(h)) // if we detected a node already visited in a HS
                return true;
            else {
                HS.add(h); // else we traversed a node first time so add in a HS
                h = h.next;
            }
        }

        return false;
    }

    /*
     * Detect a Loop in a LL using: Floyd's Cycle Finding Algorithm.
     * Time Complexity - O(n) and Space Complexity - O(1)
     */
    public static boolean detectLoopByFloyd(Node h) {
        if (h == null) // means the list is null
            return false;

        Node slow = h, fast = h;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // if slow == fast, means we detected a loop
            if (slow == fast) {
                System.out.println("Slow->" + slow.strD + " Fast->" + fast.strD);
                return true;
            }

            System.out.println("Slow->" + slow.strD + " Fast->" + fast.strD);
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = LL.addLast("Jai");
        LL.addLast("Shree");
        LL.addLast("Krishna");

        // making a loop by assigning the pointing last next to the head node.
        head.next.next.next = head;

        if (detectLoopByFloyd(head))
            System.out.println("Yes, LinkedList contains a loop.");
        else
            System.out.println("No, LinkedList don't contains a loop.");

    }
}
