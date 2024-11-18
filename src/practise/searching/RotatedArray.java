package practise.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Link to the problem----> https://www.interviewbit.com/problems/rotated-array/
public class RotatedArray {

    public static int findMin(final List<Integer> a) {
        int ans = 0;
        int lo = 0, hi = a.size() - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (a.get(mid) > a.get(0))
                lo = mid + 1;

            else {
                ans = mid;
                hi = mid - 1;
            }
        }

        return a.get(ans);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the elements in list followed by spaces :");
        // adding elements in the list
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("The minimum element in the list is - " + findMin(list));
    }
}
