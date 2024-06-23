/*----------------Notes------------------
* Binary Search is a searching algorithm to search element in o(logN) time complexity by using divide and conquer technique.  */

import sorting.UtilityClass;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearchingRecursively(int[] arr, int left, int right, int search) {

        // BinarySearch algorithm needs sorted array to search an element.
        Arrays.sort(arr);

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == search) // if the search found at middle element.
                return mid;

            if (search < arr[mid]) {
                return binarySearchingRecursively(arr, left, mid - 1, search);
            } else {
                return binarySearchingRecursively(arr, mid + 1, right, search);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to search in an array = ");
        int search = sc.nextInt();
        sc.close();

        int left = 0, right = arr.length - 1;
        int index = binarySearchingRecursively(arr, left, right, search);
        System.out.println("The searched element " + search + " found at index = " + index);

    }
}
