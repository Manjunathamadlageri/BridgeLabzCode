package com.Stocks;

import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance =  balance - amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);

        System.out.print("Enter debit amount: ");
        double debitAmount = scanner.nextDouble();
        account.debit(debitAmount);

        System.out.println("Account balance: " + account.getBalance());

    }

}
