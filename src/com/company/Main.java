package com.company;
/*
 * Created by: Maria Temu
 * Created on: 5-April-2020
 * Created for: ICS4U
 * Day #27 (Binary Search Recursively)
 * This program does Binary Search Recursively
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Main object = new Main();
        int array[] = { 2, 3, 4, 6, 8, 12, 38, 63, 88, 92  };
        int arrLength = array.length;

        System.out.println("Please enter a number: ");
        Scanner read = new Scanner(System.in) ;
        int number = read.nextInt();
        //int number = 10;
        int answer = object.binaryRecursively(array, 0, arrLength - 1, number);

        if (answer == -1)
            System.out.println("Element isn't present in array");
        else
            System.out.println("Element found at index " + answer);
    }

    int binaryRecursively(int array[], int left, int right, int number) {
        if (right >= left) {
            int middle = left + (right - left) /2;

            //element present at middle?
            if (array[middle] == number)
                return middle;

            if (array[middle] > number)
                return binaryRecursively(array, left, middle -1, number);

            //else present at right
            return binaryRecursively(array, middle + 1, right, number);
        }
        //element not present
        return -1;
    }
}
