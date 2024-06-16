package math;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int check = 1, num;
        while (check == 1) { // to check multiple numbers until user enter 0 to terminate
            System.out.print("Please enter any number to check the prime = ");
            num = sc.nextInt();
            if (isPrime(num))
                System.out.print(num + " is a Prime number.");
            else
                System.out.print(+num + " is not a Prime number.");

            System.out.print("\nDo you want to check another number enter 1 or 0 = ");
            check = sc.nextInt();
        }

        System.out.print("Please enter any number as long as you want to print all prime numbers = ");
        num = sc.nextInt();
        sc.close();
        printPrimes(num);
    }
}
