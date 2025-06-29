package practise.sorting;
/*-------------------------Notes----------------------
 * In Merge Sorting, We do divide our array in two halves and then recursively call mergesort on both two halves
 * until left index less than right index , and then recursively merge sub arrays..*/

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] tempArr = new int[right - left + 1];
        int x = 0,
                leftIdx = left,
                rightIdx = mid + 1;

        while (leftIdx <= mid && rightIdx <= right) {
            if (arr[leftIdx] <= arr[rightIdx]) {
                tempArr[x++] = arr[leftIdx++];
            } else {
                tempArr[x++] = arr[rightIdx++];
            }
        }

        while (leftIdx <= mid) {
            tempArr[x++] = arr[leftIdx++];
        }

        while (rightIdx <= right) {
            tempArr[x++] = arr[rightIdx++];
        }

        // putting back sorted arr into original arr
        for (int k = 0; k < tempArr.length; k++) {
            arr[left+k] = tempArr[k];
        }
    }

    public static void mergeSorting(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        mergeSorting(arr, left, mid);
        mergeSorting(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nThe Unsorted array elements are: ");
        UtilityClass.printArray(arr);
        // initializing left,right index of array.
        int left = 0, right = arr.length - 1;
        mergeSorting(arr, left, right);

        System.out.println("\nThe Sorted array elements are: ");
        UtilityClass.printArray(arr);
    }
}
