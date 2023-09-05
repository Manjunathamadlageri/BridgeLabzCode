package com.Stocks;
import java.util.Scanner;

class StockAccount {
    private String customerName;
    private String customerId;
    private double accountBalance;

    public StockAccount(String name, String id, double balance) {
        customerName = name;
        customerId = id;
        accountBalance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Account Balance: Rs" + accountBalance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. New balance: Rs" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawal successful. New balance: Rs" + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class StockAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter initial account balance: ");
        double balance = scanner.nextDouble();

        StockAccount account = new StockAccount(name, id, balance);

        account.displayAccountInfo();

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
    }
}
