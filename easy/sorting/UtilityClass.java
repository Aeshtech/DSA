package sorting;

import java.util.Scanner;

public class UtilityClass {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the array = ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Please input space separated elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] swapping(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];

        return arr;
    }

    public static int[] swapUsingTemp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}
