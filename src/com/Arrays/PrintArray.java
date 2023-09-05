package com.Arrays;
import java.util.Scanner;
public class PrintArray
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] +" "  );
            }
        }
    }

