package com.Arrays;

import java.util.Scanner;

public class FrequencyOfElementsWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int[] frequencies = new int[size];
        boolean[] copy = new boolean[size];

        for (int i = 0; i < size; i++) {
            int count = 1;

            if (!copy[i]) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        copy[j] = true;
                    }
                }

                frequencies[i] = count;
            }
        }
        System.out.println("Frequency of each element in the array:");
        for (int i = 0; i < size; i++) {
            if (!copy[i]) {
                System.out.println(arr[i] + ": " + frequencies[i]);
            }
        }

    }
}

