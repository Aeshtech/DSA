package practise.array;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Random {
    static Node head;

    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        Node slow = head, fast = head, midnode = null, prev_of_slow = null, start_of_second_half;

        Node temp = head; // temporary head
        if (temp == null || temp.next == null)
            return true;

        // Now run fast until it itself or its next reaches null
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev_of_slow = slow;
            slow = slow.next; // our slow will reachses to middle
        }

        /*
         * In case of Even: fast will always null at the end of the above loop.
         * In case of odd : fast will not null so in this case we will store slow
         * (middle node)
         * in the midnode and increament the slow.
         */

        if (fast != null) {
            midnode = slow;
            slow = slow.next;
        }

        // now time is to reverse the second half of the list
        start_of_second_half = slow;
        prev_of_slow.next = null; // terminating the end of first half
        Node newHead = reverseList(start_of_second_half); // reversing second half

        // compare both halves are equal or not
        boolean result = compareLists(head, newHead);

        // construct orginal list again
        reverseList(newHead);

        // if list was odd
        if (midnode != null) {
            prev_of_slow = midnode;
            midnode.next = start_of_second_half;
        } else {
            prev_of_slow = start_of_second_half;
        }

        return result;

    }

    // function to compare two lists
    static boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;

        if (temp1 != null && temp2 != null) {
            while (temp1 != null && temp2 != null) {
                if (temp1.data == temp2.data) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                } else
                    return false;
            }
        }

        // if both list temp vars are at null
        if (temp1 == null && temp2 == null) {
            return true;
        }

        return false;
    }

    // function to reverse the list
    static Node reverseList(Node h) {
        if (h == null) // if list is empty
            return h;

        Node prev = null, next = null;

        while (h != null) {
            next = h.next;
            h.next = prev;
            prev = h;
            h = next;
        }
        return prev; // now prev will point to the last node.
    }

    public static void main(String[] args) {
        head = new Node(1);
        // head.next = new Node(5);
        // head.next.next = new Node(2);
        // head.next.next.next = new Node(1);
        // head.next.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not a Palindrome");
    }
}
