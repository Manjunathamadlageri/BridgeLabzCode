package com.Arrays;

public class FrequencyOfElements
{
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
            int[] frequency = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                frequency[i] = -1;
            }
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequency[j] = 0;
                    }
                }
                if (frequency[i] != 0) {
                    frequency[i] = count;
                }
            }
            System.out.println("Frequency of each element in the array:");
            for (int i = 0; i < arr.length; i++) {
                if (frequency[i] != 0) {
                    System.out.println(arr[i] + ": " + frequency[i]);
                }
            }
        }
    }


