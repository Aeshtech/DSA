package practise.linkedList;

public class Node {
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