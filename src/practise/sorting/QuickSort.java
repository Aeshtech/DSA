package practise.sorting;

/*--------------------Notes----------------------
* In QuickSort, we first select any elem as a pivot from the array. And then shift all less elements than pivot towards left side and greater elements towards right side.*/
// Here we will select right elem as pivot element.

public class QuickSort {

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // choosing right element of array as a pivot element.
        int i = left; // "i" used to denotes the right index to place a element less than pivot
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                // dont swap if i and j indexes are same
                if (i != j) {
                    UtilityClass.swapping(arr, i, j);
                }
                i++;
            }
        }
        if (i != right) {
            UtilityClass.swapping(arr, i, right);
        }
        return i;
    }

    public static int[] quickSorting(int[] arr, int left, int right) {

        if (left < right) {
            int pidx = partition(arr, left, right);
            quickSorting(arr, left, pidx - 1);
            quickSorting(arr, pidx + 1, right);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("The Unsorted elements are :");
        UtilityClass.printArray(arr);
        System.out.println("The Sorted elements are :");
        int left = 0, right = arr.length - 1;
        UtilityClass.printArray(quickSorting(arr, left, right));
    }
}
