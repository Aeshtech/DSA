package practise.linkedList;

import java.util.Scanner;

//Printing elements in reverse order of linkedlist is different from ReverseLL.
public class PrintReverse {
    public static void reverse(Node curr) {
        if (curr.next != null)
            reverse(curr.next);
        System.out.print(curr.intD + " ");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // LinkedList list = new LinkedList();

        System.out.print("Enter the number of elements to insert in a list = ");
        int n = input.nextInt();

        System.out.println("Please add all the elements separated by spaces.");
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            LinkedList.addLast(x);
        }
        input.close();
        System.out.println("Printing Linkedlist in reverse order :");
        reverse(LinkedList.head);
        System.out.println("");
    }
}