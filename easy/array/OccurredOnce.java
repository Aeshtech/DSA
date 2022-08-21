package easy.array;

/* -------Program to return only those elements of array which are occurred only once-----------. */

import easy.sorting.UtilityClass;

import java.util.Arrays;

public class OccurredOnce {

    public static void occurringOnce(int[] arr) {
        // we have to sorted array for checking the adjacent elements of array are same or different.
        Arrays.sort(arr);

        //checking if first ele is not equal to second ele than simply print it.
        if (arr[0] != arr[1])
            System.out.print(arr[0] + " ");

        //checking if adjacent element are different than simply print else we will not print
        // because we need only those elements which are occurred once in array.
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1] && arr[i] != arr[i - 1])
                System.out.print(arr[i] + " ");
        }

        //checking if last ele is not equal to second ele than print the last element.
        if(arr[arr.length -1] != arr[arr.length - 2])
            System.out.print(arr[arr.length-1] + " ");

    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nThe elements which have occurred only once in array are given below :");
        occurringOnce(arr);
    }
}
