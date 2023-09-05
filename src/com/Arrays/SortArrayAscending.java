package com.Arrays;

import java.util.Scanner;

public class SortArrayAscending {

        public static int[] Sort ( int[] n)
        {
            for (int i = 0; i <= n.length - 1; i++) {
                for (int j = i + 1; j <= n.length - 1; j++) {
                    if (n[i] > n[j]) {
                        int temp = n[i];
                        n[i] = n[j];
                        n[j] = temp;
                    }
                }
//    		System.out.print(n[i]+" ");

            }
            for (int k = 0; k <= n.length - 1; k++) {
                System.out.print(n[k] + " ");
            }
            return n;
        }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] n = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i <= size - 1; i++) {
                n[i] = sc.nextInt();
            }
//      int n[]= {1,4,2,1,5,3};
            Sort(n);
        }
    }
