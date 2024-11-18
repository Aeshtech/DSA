package practise.array;
//Link- https://www.geeksforgeeks.org/find-second-largest-element-array/

import practise.sorting.UtilityClass;

public class FindSecondLargest {

    // find second largest in O(n) time complexity using traversal
    public static int secondLargest(int[] arr) {
        int first, second, i;

        if (arr.length < 2) {
            System.out.println("Less than 2 element found!");
            return Integer.MIN_VALUE;
        }

        first = arr[0];
        second = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > first) { // checking if current ele is greater than first
                second = first; // firstly assign the value of first into second
                first = arr[i]; // update the first with largest value so far
            } else if (arr[i] < first && arr[i] > second) // checking if current ele is in btw first and second
                second = arr[i];
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.print("The Second largest element in the array is = " + secondLargest(arr));
    }
}
