package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third number (c): ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;

        double maxResult = result1;
        if (result2 > maxResult) {
            maxResult = result2;
        }
        if (result3 > maxResult) {
            maxResult = result3;
        }
        if (result4 > maxResult) {
            maxResult = result4;
        }

        double minResult = result1;
        if (result2 < minResult) {
            minResult = result2;
        }
        if (result3 < minResult) {
            minResult = result3;
        }
        if (result4 < minResult) {
            minResult = result4;
        }

        System.out.println("Results:");
//        System.out.println("a + b * c = " + result1);
//        System.out.println("c + a / b = " + result2);
//        System.out.println("a % b + c = " + result3);
//        System.out.println("a * b + c = " + result4);

        System.out.println("Maximum result: " + maxResult);
        System.out.println("Minimum result: " + minResult);
    }
}
