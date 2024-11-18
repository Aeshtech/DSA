package practise.array;

import practise.sorting.UtilityClass;

//java program to return the sum of maximum and minimum element in the array.
public class SumOfMaxMin {
    public static int sumOfMaxMin(int[] arr) {
        int i, sum, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; // initialising min and max with the Integer Max
                                                                      // and Min value respectively.
        // traversing the array till end
        for (i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]); // Updating max, if current ele is greater than max
            min = Math.min(min, arr[i]); // Updating min, if current ele is smaller than min
        }
        sum = max + min;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray(); // taking input arr using utility class.
        System.out.print("The Sum of maximum and minimum element is = " + sumOfMaxMin(arr));
    }
}
