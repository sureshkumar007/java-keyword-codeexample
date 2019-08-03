package com.stackroute.javakeyword;

import java.util.Scanner;

public class AdditionOfTwoMatrics
{
    public static void main(String args[])
    {
        /*
        Single dimension array
         */
        int a[]={1,2,3};
        for(int i=0;i<a.length;i++)
        {
            /*
            Printing the values in a array
             */
            System.out.println(a[i]);
        }
        /*
        creating multidimensional array
         */
        int firstMatrix[][] = new int[5][5];
        int secondMatrix[][] = new int[5][5];
        int sum[][] = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("////////////This is Two matrix///////////////");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("enter the " + i + " number ");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        /*
        //Second matrix
         */
        System.out.println("///////////Second matrix//////////");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("enter the " + i + " number ");
                secondMatrix[i][j] = scanner.nextInt();
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        /*
        printing the values of sum of two dimensional array
         */
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();


        }


    }
}
