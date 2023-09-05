package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class PrintFriendsNames
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of 3 friends:");
        String friend1 = scanner.next();
        String friend2 = scanner.next();
        String friend3 = scanner.next();

        scanner.close();

        System.out.println("Hi " + friend3 + ", " + friend2 + " and " + friend1);
    }
}
