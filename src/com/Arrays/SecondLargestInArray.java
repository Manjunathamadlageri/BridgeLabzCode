package com.Arrays;

import java.util.Scanner;

public class SecondLargestInArray{

   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size < 2) {
                System.out.println("Array should have at least two elements.");
                return;
            }
            int[] numbers = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            int secondLargest = numbers[size - 2];
            System.out.println("The second-largest number in the array is: " + secondLargest);
        }
    }




















/*
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//        int[] numbers = new int[size];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Element " + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : numbers) {
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//
//        if (secondLargest != Integer.MIN_VALUE) {
//            System.out.println("The second-largest number in the array is: " + secondLargest);
//        } else {
//            System.out.println("There is no second-largest number in the array.");
//        }
//    }










//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        if (size < 2) {
//            System.out.println("Array should have at least two elements.");
//            return;
//        }
//        int[] numbers = new int[size];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Element " + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//        int largest = numbers[0];
//        int secondLargest = numbers[1];
//
//        if (largest < secondLargest) {
//            int temp = largest;
//            largest = secondLargest;
//            secondLargest = temp;
//        }
//
//        for (int i = 2; i < size; i++) {
//            if (numbers[i] > largest) {
//                secondLargest = largest;
//                largest = numbers[i];
//            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
//                secondLargest = numbers[i];
//            }
//        }
//        System.out.println("The second-largest number in the array is: " + secondLargest);
//    }
 */