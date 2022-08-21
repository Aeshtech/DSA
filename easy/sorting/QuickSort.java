package easy.sorting;

/*--------------------Notes----------------------
* In QuickSort, we first select any elem as a pivot from the array. And then shift all less elements than pivot towards left side and greater elements towards right side.*/
// Here we will select right elem as pivot element.

public class QuickSort {

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];   // choosing right element of array as a pivot element.
        int i = left-1;   //significance of i is that it is using to pointing to the last number less than the pivot.
        for(int j=left; j<right;j++){
            if(arr[j] < pivot){
                i++;
                UtilityClass.swapUsingTemp(arr,i,j);
                //we are doing swapping using temp, as in swapping without using temp there is problem
                // on swapping ele at same index that method will turn the element into 0.
            }
        }

        UtilityClass.swapUsingTemp(arr,i+1,right);
        return i+1;
    }


    public static int[] quickSorting(int[] arr, int left, int right) {

        if (left < right) {
            int pi = partition(arr, left, right);
            quickSorting(arr, left, pi - 1);
            quickSorting(arr, pi + 1, right);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        System.out.println("The Unsorted elements are :");
        UtilityClass.printArray(arr);
        System.out.println("The Sorted elements are :");
        int left = 0,right = arr.length-1;
        UtilityClass.printArray(quickSorting(arr,left,right));
    }
}
