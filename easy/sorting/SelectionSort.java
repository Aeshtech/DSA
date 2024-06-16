package sorting;
/* -----------------------Notes----------------------
*  In Selection Sorting, we do find the minimum ele in the array excluding first ele and placed at first location
*  and so on find next minimum element in array excluding from already sorted elements and placed at right location   */

public class SelectionSort {
    public static int[] selectionSorting(int[] arr) {
        // Passes: moving boundary of unsorted elements ahead one by one
        for (int i = 0; i < arr.length - 1; i++) {
            // we putting outer loop index in min so that inner loop don't compare elements
            // with ele in already sorted part.
            // i.e min
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // this means it need to be a swap
                    // -----swapping----
                    UtilityClass.swapping(arr, j, min);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // taking input arr elements using prebuilt method and assigning into an arr.
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nUnsorted array elements are: ");
        UtilityClass.printArray(arr);
        System.out.println("\nSorted array elements are: ");
        UtilityClass.printArray(selectionSorting(arr));
    }
}
