package easy.sorting;
/*-------------------------Notes----------------------
 * In Merge Sorting, We do divide our array in two halves and then recursively call mergesort on both two halves
 * until left index less than right index , and then recursively merge sub arrays..*/

public class MergeSort {

    public static int[] mergeSorting(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSorting(arr, left, mid);     //recursively invoking mergesort by passing mid index at the right parameter
            mergeSorting(arr, mid + 1, right);   //recursively invoking mergesort by passing mid+1 index at left parameter
            merge(arr, left, mid, right);          //invoking merge method
        }
        return arr;
    }

    public static int[] merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length]; // making temp arr to store sorted elements.

        int i = left, j = mid + 1, x = left; // 'x' is the iterator over temp arr

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {      //we are doing it <= because it may be less or same element in another half part.
                temp[x++] = arr[i++];    //storing first halve element in temp arr and incrementing i.
            } else {                    //if arr[i] not less than equal to arr[j] than control comes to else part
                temp[x++] = arr[j++];   //storing second halve element in temp arr and incrementing j.
            }
        }

        //from below two while loops only one will be run for the smaller half i.e subArray
        //filling rest of elements from first halve in temp arr if any.
        while (i <= mid) {
            temp[x++] = arr[i++];
        }

        //filling rest of elements from second halve in temp arr if any.
        while (j <= right) {
            temp[x++] = arr[j++];
        }

        //now copy all the sorted elements of temp arr into original array
        for(i=left; i<=right; i++){
            arr[i] = temp[i];
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nThe Unsorted array elements are: ");
        UtilityClass.printArray(arr);
        System.out.println("\nThe Sorted array elements are: ");
        //initializing left,right index of array.
        int left = 0, right = arr.length - 1;
        UtilityClass.printArray(mergeSorting(arr, left, right));
    }
}
