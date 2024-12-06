package practise.array;

import java.util.ArrayList;
import java.util.Scanner;

import practise.sorting.UtilityClass;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int left = 0, right = 0, sum = 0;
        ArrayList<Integer> AL = new ArrayList<Integer>();

        for (right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > s) {
                sum -= arr[left];
                left++;
            }

            if (sum == s) {
                AL.add(left + 1);
                AL.add(right + 1);
                return AL;
            }
        }

        AL.add(-1);
        return AL;
    }

    public static void main(String[] args) {
        int[] arr = UtilityClass.inputArray();
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sub array = ");
        int sum = sc.nextInt();
        sc.close();

        System.out.println(subarraySum(arr, len, sum));
    }
}
