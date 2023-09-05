package com.Arrays;

import java.util.Scanner;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Elements in reverse order:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] +" ");
        }
    }
}

