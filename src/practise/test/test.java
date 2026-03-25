package practise.test;

import practise.sorting.UtilityClass;

public class test {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("\nUnsorted array elements are: ");
        UtilityClass.printArray(arr);

        System.out.println("\nSorted array elements are: ");
        // selectionSort(arr);
        UtilityClass.printArray(arr);
    }
}
