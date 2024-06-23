package sorting;
/* -----------------------Notes----------------------
*  In Selection Sorting, we do find the minimum ele in the array excluding first ele and placed at first location
*  and so on find next minimum element in array excluding from already sorted elements and placed at right location   */

public class SelectionSort {
    public static int[] selectionSorting(int[] arr) {

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) {
            // flag to break from outer loop if no swap occured (i.e elements sorted)
            boolean isSwapped = false;
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) { // this means it need to be a swap
                    // -----swapping----
                    // minIdx = j;
                    UtilityClass.swapUsingTemp(arr, j, minIdx);
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
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
