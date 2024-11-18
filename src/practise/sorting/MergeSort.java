package practise.sorting;
/*-------------------------Notes----------------------
 * In Merge Sorting, We do divide our array in two halves and then recursively call mergesort on both two halves
 * until left index less than right index , and then recursively merge sub arrays..*/

public class MergeSort {

    public static int[] merge(int[] arr, int left, int mid, int right) {
        int[] tempArr = new int[right - left + 1];
        int x = 0, i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tempArr[x++] = arr[i++];
            } else {
                tempArr[x++] = arr[j++];
            }
        }

        while (i <= mid) {
            tempArr[x++] = arr[i++];
        }

        while (j <= right) {
            tempArr[x++] = arr[j++];
        }

        for (int k = 0; k < tempArr.length; k++) {
            arr[left + k] = tempArr[k];
        }

        return arr;
    }

    public static int[] mergeSorting(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSorting(arr, left, mid);
            mergeSorting(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nThe Unsorted array elements are: ");
        UtilityClass.printArray(arr);
        System.out.println("\nThe Sorted array elements are: ");
        // initializing left,right index of array.
        int left = 0, right = arr.length - 1;
        UtilityClass.printArray(mergeSorting(arr, left, right));
    }
}
