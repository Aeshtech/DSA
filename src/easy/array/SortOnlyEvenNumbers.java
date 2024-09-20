package easy.array;

import easy.sorting.UtilityClass;

import java.util.Collections;
import java.util.Vector;

/* ---------Java Program to Sort all even numbers in the Array without changing the order of odd elements--------
Approach:-
We want to sort all even numbers in the array without changing the order of the odd elements. So the idea is simple, we store all the even numbers from the given array to another temporary container and then sort that temporary container.

The temporary container contains all even numbers from the given array in sorted form.

Finally, we replace the even numbers from the given array with the even numbers in the temporary container one by one.

Sample Input : 6 5 4 9 7 2 5
Sample Output : 2 5 4 9 7 6 5

In Above output all odd numbers are at their same positions and all even numbers are sorted.
*/

public class SortOnlyEvenNumbers {

    public static void sortOnlyEvenNumbers(int[] arr) {
        Vector<Integer> temp = new Vector<>(); // it will used to store all even numbers from the array.

        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0)
                temp.add(arr[i]); // adding the even numbers in temp container
            i++;
        }
        // Now sort all even numbers using built in method.
        Collections.sort(temp);

        // Now replace the even numbers from the given array with the even numbers in
        // the temporary container one by one.
        int j = 0, k = 0;
        while (j < arr.length) {
            if (arr[j] % 2 == 0) { // check for only even numbers in arr
                arr[j] = temp.get(k); // replacing the even num of arr with the sorted even num of temp container.
                k++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        UtilityClass.printArray(arr);

        // invoking our method to sort only even numbers from the array and printing
        // updated arr
        sortOnlyEvenNumbers(arr);
        UtilityClass.printArray(arr);

    }
}
