package easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSortWithNegativeNumbers {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Find the minimum and maximum values in the list
        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max)
                max = arr.get(i);
            if (arr.get(i) < min)
                min = arr.get(i);
        }

        // Calculate the range of the numbers
        int range = max - min + 1;

        // Create the counting array and initialize it with zeros
        int[] countingArr = new int[range];
        Arrays.fill(countingArr, 0);

        // Populate the counting array
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            // Adjust the index by subtracting the minimum value
            countingArr[value - min] += 1;
        }

        // Reconstruct the sorted list
        int index = 0;
        for (int i = 0; i < countingArr.length; i++) {
            while (countingArr[i] > 0) {
                // Adjust the value back by adding the minimum value
                arr.set(index, i + min);
                index++;
                countingArr[i] -= 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(63);
        arr.add(-25);
        arr.add(73);
        arr.add(1);
        arr.add(-98);
        arr.add(73);
        arr.add(56);
        arr.add(-84);
        arr.add(86);
        arr.add(-57);

        System.out.println("Original List: " + arr);

        List<Integer> sortedArr = countingSort(arr);

        System.out.println("Sorted List: " + sortedArr);
    }
}
