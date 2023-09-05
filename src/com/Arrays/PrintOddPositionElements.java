package com.Arrays;

import java.util.Scanner;

public class PrintOddPositionElements {
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
        System.out.println("Elements at odd positions:");

        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println("Element at position " + (i + 1) + ": " + numbers[i]);
            }
        }
    }
}

