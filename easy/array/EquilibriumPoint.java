package array;

import sorting.UtilityClass;
//Link (Method 2) - https://www.geeksforgeeks.org/equilibrium-index-of-an-array/?ref=lbp

// Time Complexity: O(n)
public class EquilibriumPoint {
    public static int equilibriumPoint(int[] arr) {
        int leftSum = 0, totalSum = 0, n = arr.length;

        // find the sum of whole array.
        for (int i = 0; i < n; i++)
            totalSum += arr[i];

        /*
         * Traverse again and firstly subtract the current element from the totalSum and
         * check on each iteration that wheather
         * leftSum (initially 0) is equal to the totalSum, if it equal than simply
         * return the index else
         * add the current element in the leftSum.
         */

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // firstly subtract rstcurr ele from totalSum

            if (leftSum == totalSum) // check if both leftSum & totalSum are equal
                return i; // +1 for returning readable position

            leftSum += arr[i]; // else add curr ele in leftSum
        }

        return -1; // if we don't find any equilibrium point.
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        if (equilibriumPoint(arr) != -1) {
            System.out.print("The Equilibrium point of the array is = " + equilibriumPoint(arr));
        } else
            System.out.println("Sorry, We don't find any Equilibrium Point in the array.");
    }
}
