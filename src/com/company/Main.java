package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Zadacha 3 ----------------------------------------------------------------------
       /* int[] arr = new int[40];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201) - 100;
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("\nMinimum = " + min);
        System.out.println("Maximum = " + max);
        */
//------------------------------------------------------------------------------------------

// Zadacha 2 ----------------------------------------------------------------------
       /* int[][] myarr = new int[3][3];
        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr.length; j++) {
                myarr[i][j] = (int) (Math.random() * 61) - 30;
                System.out.print(myarr[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr.length; j++) {
                if (myarr[i][j] < 0)
                    System.out.println("Index " + i + " " + j + " ");
            }
        }
        */
//------------------------------------------------------------------------------------------


        // Zadacha 1 ----------------------------------------------------------------------
        System.out.println("Matrica C ");
        int[][] arrC = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC.length; j++) {
                arrC[i][j] = rand.nextInt(100);
                System.out.print(arrC[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");


        System.out.println("Matrica D ");
        int[][] arrD = new int[3][3];
        Random randD = new Random();
        for (int i = 0; i < arrD.length; i++) {
            for (int j = 0; j < arrD.length; j++) {
                arrD[i][j] = randD.nextInt(100);
                System.out.print(arrD[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("Symma C+D ");
        int[][] arrS = new int[3][3];
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS.length; j++) {
                arrS[i][j] = arrC[i][j] + arrD[i][j];
                System.out.print(arrS[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("Umnojenie C*D ");
        int[][] arrU = new int[3][3];
        for (int i = 0; i < arrU.length; i++) {
            for (int j = 0; j < arrU.length; j++) {
                arrU[i][j] = arrC[i][j] * arrD[j][i];
                System.out.print(arrU[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
