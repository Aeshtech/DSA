package easy.linkedList;

import java.util.Scanner;

//Printing elements in reverse order of linkedlist is different from ReverseLL.
class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

public class PrintReverse {
    public static void reverse(Node curr) {
        if (curr.next != null)
            reverse(curr.next);
        System.out.print(curr.intD + " ");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter the number of elements to insert in a list = ");
        int n = input.nextInt();

        System.out.println("Please add all the elements separated by spaces.");
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            list.add(x);
        }
        input.close();
        System.out.println("Printing Linkedlist in reverse order :");
        reverse(list.head);
        System.out.println("");
    }
}