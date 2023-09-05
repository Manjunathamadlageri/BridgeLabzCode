package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class SpringSeason
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int m = scanner.nextInt();

        System.out.print("Enter the day: ");
        int d = scanner.nextInt();

        int springStartMonth = 3;
        int springStartDay = 20;
        int springEndMonth = 6;
        int springEndDay = 20;

        boolean isSpring = false;

        if (m >= springStartMonth && m <= springEndMonth) {
            if (m > springStartMonth && m < springEndMonth) {
                isSpring = true;
            } else if (m == springStartMonth && d >= springStartDay) {
                isSpring = true;
            } else if (m == springEndMonth && d <= springEndDay) {
                isSpring = true;
            }
        }

        System.out.println(isSpring);
    }
}
/*
public class CheckTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber;
        while (true) {
            System.out.print("Enter a month number (1-12): ");
            if (scanner.hasNextInt()) {
                monthNumber = scanner.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12) {
                    break;
                } else {
                    System.out.println("Invalid input. Month number should be between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }

        scanner.close();

        String season;
        switch (monthNumber) {
            case 2:
            case 3:
                season = "Vasanta";
                break;
            case 4:
            case 5:
                season = "Grishma / Summer";
                break;
            case 6:
            case 7:
                season = "Monsoon / Rainy";
                break;
            case 8:
            case 9:
                season = "Sharada";
                break;
            case 10:
            case 11:
                season = "Hemanta";
                break;
            case 12:
            case 1:
                season = "Shishira / Winter";
                break;
            default:
                season = "Unknown";
        }

        System.out.println("Season for month " + monthNumber + " is: " + season);
    }
}
 */