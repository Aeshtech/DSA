package string;

public class SumofNumbersInString {
    // Function to calculate sum of all numbers present in a string.
    public static long findSum(String str) {
        long sum = 0;
        String temp = "0"; // temporary string for holding consecutive numbers in string.

        // traverse till the length of string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') { // if current char is numeric than add in temp string
                temp = temp + c;
            } else { // else parse the temp string into long and add into sum and then assign to sum
                     // itself
                sum += Long.parseLong(temp);
                temp = "0"; // reset temp string to '0' again for storing next consecutive numeric values if
                            // any.
            }
        }
        sum += Long.parseLong(temp); // at last parse the temp again and add to sum and then assign to sum itself
        return sum;
    }

    public static void main(String[] args) {
        String str = "1abc23";
        System.out.print("The sum of numbers in string is = " + findSum(str));
    }
}
