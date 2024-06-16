public class DetectPalindrome {

    public static boolean isPalindrome(Node head) {
        // midnode and prev_of_slow will be used to handle odd size list.
        Node slow = head, fast = head, midnode = null, prev_of_slow = null, start_of_second_half;
        boolean result = true;

        // if list contains only one ele or null then simply return true.
        if (head == null || head.next == null)
            return true;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev_of_slow = slow; // prev_of_slow will use to terminate the first half
            slow = slow.next; // at the end, slow will contain the middle of the list
        }

        /*
         * fast would become NULL when there are even elements in the list and not NULL
         * for odd elements. We need to skip
         * the middle node for odd case and store it somewhere so that we can restore
         * the original list
         */

        if (fast != null) {
            midnode = slow;
            slow = slow.next; // now our slow point to the start of second half.
        }

        // Now, time is to reverse the second half
        start_of_second_half = slow;
        prev_of_slow.next = null; // this will terminates the end of first half
        Node reversed_head = ReverseLL.reverseList(start_of_second_half); // will reverse second half

        result = comparelist(head, reversed_head);

        /*---------Construct the original list back---------- */
        ReverseLL.reverseList(reversed_head); // Reverse the second half again
        if (midnode != null) {
            // If there was a mid node (odd size case) which
            // was not part of either first half or second half.
            prev_of_slow.next = midnode;
            midnode.next = start_of_second_half;
        } else
            prev_of_slow.next = start_of_second_half;

        return result;
    }

    public static boolean comparelist(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.strD == temp2.strD) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else
                return false;
        }

        // this will ensure both half part's temp are empty
        if (temp1 == null && temp2 == null) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = LL.addLast("a");
        LL.addLast("b");
        LL.addLast("a");
        LL.addLast("c");
        LL.addLast("a");
        LL.addLast("b");
        LL.addLast("a");

        LL.printList(head, "String");

        if (isPalindrome(head))
            System.out.println("Yes, The provided list is a Palindrome");
        else
            System.out.println("No, The provided list is not a Palindrome");

        System.out.println("Our Original list was :");
        LL.printList(head, "String");
    }
}
