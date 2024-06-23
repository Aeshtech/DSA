package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//radix sort uses 
public class RadixSort {

    // time complexity O(d.n), space complexity O(n + k) where d is the total digits
    // in max value, n is size of input, k is 10 (digits from 0-9)
    public static void radixSort(int[] myArray, int n) {
        // Find the maximum number to know number of digits
        int m = Arrays.stream(myArray).max().getAsInt();

        // this loop will run d times, 'd'= number of digits in the max value
        for (int exp = 1; m / exp > 0; exp *= 10) {

            // Create an array of ArrayLists to hold the radix buckets
            List<List<Integer>> radixArray = new ArrayList<>();
            // this will intialize empty buckets in radixArray (size = 10) (two dimensional
            // arraylist);
            for (int i = 0; i < 10; i++) {
                radixArray.add(new ArrayList<>());
            }

            // Distribute elements into buckets based on the current digit will take O(n)
            for (int i = 0; i < myArray.length; i++) {
                int val = myArray[i];
                int radixIndex = (val / exp) % 10;
                radixArray.get(radixIndex).add(val);
            }

            // Collect the elements from the buckets back into the array
            int index = 0;
            // this will run 10 times
            for (List<Integer> bucket : radixArray) {
                // it can run worst O(n) times if all elements of orignal array in same bucket
                while (!bucket.isEmpty()) {
                    myArray[index++] = bucket.remove(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;
        System.out.println("Original List: " + Arrays.toString(arr));
        radixSort(arr, n);
        System.out.println("Sorted List: " + Arrays.toString(arr));
    }
}
