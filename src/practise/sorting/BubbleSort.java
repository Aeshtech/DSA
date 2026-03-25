package practise.sorting;

/* -----------------Notes----------------
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
And move greatest element at last position and then second greatest ele at second last position and so on....*/
//5 2 3
public class BubbleSort {

    public static int[] bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false; // a boolean var to run out further sorting if their was no swap in inner loop.
            for (int j = 0; j < n - i - 1; j++) {
                // checking if left sibling is greater than right, then swap these
                if (arr[j] > arr[j + 1]) { 
                    UtilityClass.swapping(arr, j, j + 1);
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break outer loop, its meant our array is sorted
            if (swapped != true)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        // taking input arr elements using prebuilt method and assigning into an arr.
        int[] arr = UtilityClass.inputArray();
        System.out.println("\nUnsorted array elements are: ");
        UtilityClass.printArray(arr);

        System.out.println("\nSorted array elements are: ");
        UtilityClass.printArray(bubbleSorting(arr));
    }
}
