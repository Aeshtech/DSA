package practise.sorting;

/*------------------Notes----------------
* In Insertion sorting, we select the second element i.e ele at index 1 of the array and compare with first element at index 0 and swap if it is smaller than first element. Now we move from second element to right element and check for all preceding elements one by one by shifting all elements one step ahead which are greater than the key element and insert the key element at right location. */

public class InsertionSort {
    public static int[] insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Passes
            int key = arr[i]; // holding our key element for inserting at right location
            int j = i - 1; // holding i-1 value
            // running loop until j greater than equal to 0 and key element is less than its
            // preceding elements.
            while (j >= 0 && key < arr[j]) {
                // now we will shift the preceding element of key element to one position ahead
                arr[j + 1] = arr[j];
                j--;
            }
            // now inserting the key element at right location.
            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        // taking input arr elements using prebuilt method and assigning into an arr.
        // int[] arr = UtilityClass.inputArray();
        // System.out.println("\nUnsorted array elements are: ");
        // UtilityClass.printArray(arr);
        // System.out.println("\nSorted array elements using iterative shifting: ");
        // UtilityClass.printArray(insertionSorting(arr));

        int[] arr = UtilityClass.inputArray();
        System.out.println("\nUnsorted Array: ");
        UtilityClass.printArray(arr);
        System.out.println("\nSorted Array: ");
        UtilityClass.printArray(insertionSorting(arr));

    }
}
