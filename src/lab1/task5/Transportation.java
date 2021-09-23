package lab1.task5;

import java.util.Scanner;

public class Transportation {
    int i, j, rows, columns;
    Scanner scr = new Scanner(System.in);
    int[][] array;


    public void read() {
        System.out.println("Enter the number of rows and columns:");
        rows = scr.nextInt();
        columns = scr.nextInt();
        array = new int[rows][columns];
        System.out.println("Enter the " + rows * columns + " elements of matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = scr.nextInt();
            }
        }
    }


    public void display() {

        System.out.println("Matrix before transposing");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.print("\n");
        }


    }

    public void transposition() {
        System.out.print("\n");
        System.out.println("Matrix after transposing");
        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                System.out.print(array[j][i] + " ");

            }
            System.out.print("\n");

        }

    }
}
