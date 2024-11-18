package practise.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Link - https://www.codingninjas.com/codestudio/problems/reverse-the-array_1262298?topList=love-babbar-dsa-sheet-problems

// ********* Program to reverse the array after a certain position ********
public class ReverseArrayAfterPos {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arrli, int pos) {
        int left = pos + 1; // left pointer at the right of given pos
        int right = arrli.size() - 1; // right pointer at the end of arrli

        while (left <= right) {
            Collections.swap(arrli, left, right);
            left++;
            right--;
        }
        return arrli;
    }

    // driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the nunber of elements you want in ArrayList = ");
        int n = sc.nextInt();
        // declaring and instantiating Arraylist
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        // inserting elements at the end of arrli
        for (int i = 0; i < n; i++) {
            // System.out.print("Please enter a element = ");
            arrli.add(sc.nextInt());
        }
        sc.close();
        System.out.println(arrli);
        System.out.println(reverseArray(arrli, 3));
    }
}
