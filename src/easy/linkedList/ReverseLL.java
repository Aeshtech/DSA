package easy.linkedList;

public class ReverseLL {

    // Reverse of LinkedList
    public static Node reverseList(Node h) {
        Node prev = null;
        Node next = null;
        Node current = h; // temporary node containing head ref

        while (current != null) {
            // Before changing the next of the current,
            // keep the next node
            next = current.next;
            // Now changing the next of current
            // it is where the reversing takes place
            current.next = prev;
            // Moving the previous and current forward for one step
            prev = current;
            current = next;
        }
        h = prev; // now prev pointing to the last node so we update our head with prev
        return h;
    }

    public static void main(String[] args) {

        Node head = LinkedList.addLast("Jai");
        LinkedList.addLast("Shiv");
        LinkedList.addLast("Shankar");
        System.out.println("List before reversing :");
        LinkedList.printList(head, "String");

        System.out.println("\nList after reversed : ");
        Node newHead = reverseList(head); // here we getting a new head which is pointing to the end of the LL
        LinkedList.printList(newHead, "String");
    }
}
