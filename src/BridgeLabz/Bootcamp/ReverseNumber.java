package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        reverseInteger(n);

    }

    public static void reverseInteger(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(reversed);
    }
}
