package lab1.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter the number of rows and columns:");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();
        int columns = scr.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Enter the " + rows * columns + " elements of matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = scr.nextInt();
            }
        }
        System.out.println("Matrix before transposing");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.print("\n");

        }
        System.out.println("Matrix after transposing");
        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                System.out.print(array[j][i] + " ");

            }
            System.out.print("\n");

        }
    }
}
