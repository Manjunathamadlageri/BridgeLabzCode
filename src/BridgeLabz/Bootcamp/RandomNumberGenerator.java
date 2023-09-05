package BridgeLabz.Bootcamp;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a number");
            int lowerBound = scanner.nextInt();
            System.out.println("Enter another number");
            int upperBound = scanner.nextInt();

            int randomNum = generateRandomNumber(lowerBound, upperBound);

            System.out.println("Random number between " + lowerBound + " and " + upperBound + ": " + randomNum);
        }

        static int generateRandomNumber(int lower, int upper) {
            Random rand = new Random();
            int randomNum = rand.nextInt(upper - lower + 1) + lower;
            return randomNum;
        }



}
/*
 public static void main(String[] args) {
        int lowerBound = 10;
        int upperBound = 50;

        int randomNum = generateRandomNumber(lowerBound, upperBound);

        System.out.println("Random number between " + lowerBound + " and " + upperBound + ": " + randomNum);
    }

    static int generateRandomNumber(int lower, int upper) {
        double randomValue = Math.random();

        int range = upper - lower + 1;
        int randomNum = (int) (randomValue * range) + lower;

        return randomNum;
    }











public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        int randomNum = generateRandomNumber(lowerBound, upperBound);

        System.out.println("Random number between " + lowerBound + " and " + upperBound + ": " + randomNum);

    }
    static int generateRandomNumber(int lower, int upper) {
        double randomValue = Math.random();
        int range = upper - lower + 1;
        int randomNum = (int) (randomValue * range) + lower;
        return randomNum;
    }
 */
