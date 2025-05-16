package practise.string;

public class SumofNumbersInString {
    // Function to calculate sum of all numbers present in a string.
    public static long findSum(String str) {
        long sum = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                temp.append(c);
            } else if (temp.length() > 0) {
                sum += Long.parseLong(temp.toString());
                temp.setLength(0);
            }
        }

        if (temp.length() > 0) {
            sum += Long.parseLong(temp.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "1abc5asa7aas9";
        System.out.print("The sum of numbers in string is = " + findSum(str));
    }
}
