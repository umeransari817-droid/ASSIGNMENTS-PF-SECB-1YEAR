//Assignment: Write Java program that takes input dimension of a square matrix, then take input all the elements of the matrix. Your program should calculate sum of all the elements in each of the row and in each of the column, moreover it should also display the sum of all the diagonal elements and then sum all reverse diagonal elements
import java.util.Scanner;

public class SquareMatrixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
            return;
        }

        int[][] data = new int[size][size];

        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter elements for Row " + (i + 1) + ": ");
            for (int j = 0; j < size; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEntered Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n Row Sums");
        for (int i = 0; i < size; i++) {
            int rSum = 0;
            for (int j = 0; j < size; j++) {

                rSum = rSum + data[i][j]; 
            }
            System.out.println("Row " + (i + 1) + " sum: " + rSum);
        }

        System.out.println("\n Column Sums");
        for (int j = 0; j < size; j++) {
            int cSum = 0;
            for (int i = 0; i < size; i++) {
                // yahan bhi full form
                cSum = cSum + data[i][j]; 
            }
            System.out.println("Column " + (j + 1) + " sum: " + cSum);
        }

        int mainDiagonal = 0;
        int reverseDiagonal = 0;

        for (int i = 0; i < size; i++) {
            mainDiagonal = mainDiagonal + data[i][i];           
            reverseDiagonal = reverseDiagonal + data[i][size - 1 - i]; 
        }

        System.out.println("\n Diagonal Sums ");
        System.out.println("Primary Diagonal Sum: " + mainDiagonal);
        System.out.println("Reverse Diagonal Sum: " + reverseDiagonal);

        sc.close();
    }
}