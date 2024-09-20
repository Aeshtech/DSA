/*-----------------------Notes------------------
 * LinkedList -> A linked list is a linear collection of data nodes in a non-contiguous memory locations, in which each node contain two things first is "Data" and second thing is  "Pointer"/"Reference" to the next node.  */

class Node {
    String strD; // data variable
    int intD; // variable of int data type
    Node next; // next ref var of Node class type.

    Node(String d) { // constructor
        strD = d; // initialising data to the node.
        next = null; // initially next store null
    }

    Node(int d) { // constructor
        intD = d; // initialising data to the node.
        next = null; // initially next store null
    }

}

public class LL {
    // create first node which will work as a head of the linked list
    static Node head;

    // ------method to print the list.
    public static void printList(Node head, String dataType) {
        Node currNode = head; // currNode a temporary head var which used to traverse i.e protects our head to
                              // modify.

        while (currNode != null) { // run until currNode itself become equal to null.
            if (dataType == "String") // checking if Node was made up for string or int datatype
                System.out.print(currNode.strD + " -> ");
            else
                System.out.print(currNode.intD + " -> ");

            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // method for adding a node at start of LinkedList i.e at first position.
    public static Node addFirst(String data) {
        Node newNode = new Node(data); // making a newNode

        if (head == null) { // if list is empty
            head = newNode;
            return head;
        }

        newNode.next = head; // storing head ref in the newNode.next
        head = newNode; // then initialising newNode at head ref. So, that our new node becomes head
                        // node.
        return head;
    }

    // method for adding a node at end of LinkedList i.e at last position.
    public static Node addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            return head;
        }

        Node currNode = head; // a temporary head var which used to traverse i.e protects our head to modify.
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }

    // method overloading for adding a node at end of LinkedList i.e at last
    // position.
    public static Node addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            return head;
        }

        Node currNode = head; // a temporary head var which used to traverse i.e protects our head to modify.
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }

    // method to delete node at any position in the LinkedList.
    public static void deleteAt(int position) {

        // if linkedlist is empty
        if (head == null)
            return;

        // store head ref in a temp variable
        Node temp = head;

        // if head node to be deleted
        if (position == 0) {
            head = temp.next; // means assigning the temp.next to the head
            return;
        }

        // find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // if position is more than number of nodes in linkedlist
        if (temp == null || temp.next == null)
            return;

        // node temp.next is the node to be deleted
        // store pointer/ref to the next of node to be deleted.
        Node next = temp.next.next;
        temp.next = next; // unlink the deleted node from the list

    }

    // insert a node at particular position in the linkedlist
    public static void addAt(int position, int data) {
        Node newNode = new Node(data);
        if (head == null) { // if list is empty
            head = newNode;
            return;
        }

        if (position == 0) { // if node to be insert at position 0
            newNode.next = head;
            head = newNode;
            return;
        }

        // if node to be insert at another position
        // find the previous node of the node to be insert
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // if position is greater than the number of nodes
        if (temp == null)
            return;

        // store the ref/pointer of where we have to insert new node
        Node ref = temp.next;
        temp.next = newNode; // inserting node at given position
        newNode.next = ref;
    }

    // ----------Main Method-----------
    public static void main(String[] args) {
        LL list = new LL();

        Node head1 = addLast("Krishna");
        addLast("Shree");
        addLast("Jai");
        printList(head1, "String");

        head = null; // Note: for making new list we have to reassign our 'head' as null

        Node head2 = addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        printList(head2, "int");

        deleteAt(3);
        System.out.println("Updated list after deletion at position 3 :");
        printList(head2, "int");

        System.out.println("Updated list after insertion at position 3 :");
        addAt(1, 5);
        printList(head2, "int");
    }

}
