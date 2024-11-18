package practise.array;

import java.util.Scanner;

public class TransposeOfMatrix {

    public static int[][] inverseSqMatrix(int[][] mat) {
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }

    public static int[][] inputSqMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix = ");
        int size = sc.nextInt();
        int[][] mat = new int[size][size]; // declaring matrix of given size

        System.out.println("Enter all elements separated by spaces:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        return mat;
    }

    public static void printSqMatrix(int[][] mat) {
        // mat.length will only return the length of the row as we are working on sq
        // matrix so row and col are same.
        // if we want col len then we can do it as : cols = mat[0].length;
        int size = mat.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = inputSqMatrix();
        System.out.println("Matrix before inverse :");
        printSqMatrix(mat);
        System.out.println("Matrix after inverse :");
        inverseSqMatrix(mat);
        printSqMatrix(mat);
    }
}
