package practise.sorting;

/* Selection Sort is a comparison-based sorting algorithm. It sorts by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element.

1. Find the smallest element and swap it with the first element. This way we get the smallest element at its correct position.
2. Then find the smallest among remaining elements (or second smallest) and swap it with the second element.
3. We keep doing this until we get all elements moved to correct position. */

public class SelectionSort {
    public static int[] selectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            UtilityClass.swapUsingTemp(arr, i, minIdx);
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