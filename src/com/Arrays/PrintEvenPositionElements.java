package com.Arrays;

import java.util.Scanner;

public class PrintEvenPositionElements
{
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
        System.out.println("Elements at even positions:");

        for (int i = 0; i < size; i += 2) {
            System.out.println("Element at position " + i + ": " + numbers[i]);
        }
    }
}

