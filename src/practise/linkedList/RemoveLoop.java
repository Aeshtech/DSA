package practise.linkedList;

import java.util.HashSet;

//Link - https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
public class RemoveLoop {

    // Function that detects and remove loop in the list (GFG Method 3)
    // Time Complexity - O(n) and Space Complexity - O(1)
    static void detectAndRemoveLoop(Node node) {

        // If list is empty or has only one node
        // without loop
        if (node == null || node.next == null)
            return;

        Node slow = node, fast = node;

        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }

        /* If loop exists */
        if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                /* since fast->next is the looping point */
                fast.next = null; /* remove loop */
            }
            /* This case is added if fast and slow pointer meet at first position. */
            else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }

    // Detect and Remove loop using Hashset....Easy Implementation but take more
    // space.
    // Time Complexity - O(n) and Space Complexity - O(1)
    static boolean removeLoopUsingHS(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with nuLinkedList.

            if (s.contains(h)) {
                prev.next = null;
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = LinkedList.addLast(50);
        LinkedList.addLast(20);
        LinkedList.addLast(15);
        LinkedList.addLast(4);
        LinkedList.addLast(10);

        // making a loop by assigning the pointing last next to the head node.
        head.next.next.next.next.next = head.next.next;

        detectAndRemoveLoop(head);
        System.out.println("Linkedlist after removing the loop: ");

        // removeLoopUsingHS(head);
        // System.out.println("Linkedlist after removing the loop using HashSet: ");

        LinkedList.printList(head, "int");
    }
}
