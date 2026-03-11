package practise.sorting;
/*-------------------------Notes----------------------
 * In Merge Sorting, We do divide our array in two halves and then recursively call mergesort on both two halves
 * until left index less than right index , and then recursively merge sub arrays..*/

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, 
        k = 0; //iterator for temp arr

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // putting back sorted temp elements into original arr
        System.arraycopy(temp, 0, arr, left, temp.length);
        
        // //looping way of copy
        // for (int m = 0; m < temp.length; m++) { 
        //     arr[left+m] = temp[m];
        // }
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
