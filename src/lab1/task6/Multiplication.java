package lab1.task6;

import java.util.Scanner;

public class Multiplication {
    int rows1, rows2, columns1, columns2, i, j, k;
    Scanner scr = new Scanner(System.in);
    int[][] matrix1;
    int[][] matrix2;
    int[][] resultedMatrix;


    public void read() {
        System.out.println("Enter the number of rows of first matrix");
        rows1 = scr.nextInt();

        System.out.println("Enter the number columns of first matrix");
        columns1 = scr.nextInt();
        System.out.println("Enter the number of rows of second matrix");
        rows2 = scr.nextInt();

        System.out.println("Enter the number of columns of  second matrix ");
        columns2 = scr.nextInt();

        matrix1 = new int[rows1][columns1];
        matrix2 = new int[rows2][columns2];
        resultedMatrix = new int[rows1][columns2];

        System.out.println("Enter the elements of first matrix");

        for (i = 0; i < rows1; i++) {
            for (j = 0; j < columns1; j++)
                matrix1[i][j] = scr.nextInt();

        }
        System.out.println("Enter the elements of second matrix");

        for (i = 0; i < rows2; i++) {

            for (j = 0; j < columns2; j++)
                matrix2[i][j] = scr.nextInt();

        }
    }

    public void multiplication() {
        if (columns1 == rows2) {
            System.out.println("\n\noutput matrix:-");
            for (i = 0; i < rows1; i++)

                for (j = 0; j < columns2; j++) {
                    resultedMatrix[i][j] = 0;
                    for (k = 0; k < rows2; k++) {
                        resultedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];

                    }

                }

            for (i = 0; i < rows1; i++) {
                for (j = 0; j < columns2; j++)
                    System.out.print(resultedMatrix[i][j] + " ");

                System.out.println();
            }
        } else {
            System.out.println("You cam not multiplicate these matrixes");
        }
    }


}

