package com.stackroute;

import java.util.Scanner;

public class matrixAddition {
   private int row;
   private int col;

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    public static void main(String[] args) {
        matrixAddition obj = new matrixAddition();

        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number "
                    + "of rows of the matrix");
            m = in.nextInt();
            obj.setRow(m);
            System.out.println("Enter the number "
                    + "of columns of the matrix");
            n = in.nextInt();
            obj.setCol(n);
            // Declare the matrix
            int first[][] = new int[m][n];

            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();


                // Declare the matrix
                int second[][] = new int[m][n];

                // Read the matrix values
                System.out.println("Enter the elements of second matrix");
                for (i = 0; i < m; i++)
                    for (j = 0; j < n; j++)
                        second[i][j] = in.nextInt();



             int sum[][]= new int[m][n];
                for(int q = 0;q<m;q++){
                    for(int w = 0;w<n;w++){
                        sum[q][w] = first[q][w]+second[q][w];
                        System.out.print(sum[q][w]+" ");
                    }
                    System.out.println();
                }

            }
        catch (Exception e) {
        System.out.println("Error ra bhai");
        }
        finally {
            in.close();
        }


    }

    }
