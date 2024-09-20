package easy.array;//Program to print all odd numbers first and then even numbers

import java.util.Scanner;

public class RearrangeOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want to print = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter a number = ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < size; i++) { // loop printing the all odd numbers first
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        for (int i = 0; i < size; i++) { // loop printing the all even numbers first
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}