//Muhammad Umer Ansari, #44-Sec B,First year Evening
//Assignment Question: Create a java program which takes input of matrices and print the sum of its rows and coulmns, sums columns and also the sum of forward and reverse diagonals  

import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking matrix size
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Creating matrix
        int[][] matrix = new int[rows][columns];

        // Taking matrix elements
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("\nMatrix you entered is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
                //Space inside quotes: This adds a space after prinitng each number. 
            }
            System.out.println();
        }

        input.close();
    }
}