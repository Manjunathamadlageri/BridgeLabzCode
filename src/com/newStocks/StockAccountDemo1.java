package com.newStocks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CompanyShares {
    private String symbol;
    int numberOfShares;

    public CompanyShares(String symbol, int numberOfShares) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }
}

class StockAccount {
    private List<CompanyShares> companySharesList;

    public StockAccount() {
        companySharesList = new ArrayList<>();
    }
    public void buy(String symbol, int amount) {
        companySharesList.add(new CompanyShares(symbol, amount));
        System.out.println(amount + " shares of " + symbol + " bought.");
    }

    public void sell(String symbol, int amount) {
        for (CompanyShares shares : companySharesList) {
            if (shares.getSymbol().equals(symbol)) {
                int currentShares = shares.getNumberOfShares();
                if (amount <= currentShares) {
                    shares.numberOfShares -= amount;
                    System.out.println(amount + " shares of " + symbol + " sold.");
                } else {
                    System.out.println("Insufficient shares to sell.");
                }
                return;
            }
        }
        System.out.println("No shares of " + symbol + " to sell.");
    }

    public double valueOf() {
        double totalValue = 0;
        // Implement logic to calculate the total value of stocks
        for (CompanyShares shares : companySharesList) {
            // Placeholder logic: Total value = number of shares * price per share
            totalValue += shares.getNumberOfShares() * 10; // Assuming each share costs $10
        }
        return totalValue;
    }
    public void printReport() {
        System.out.println("Stock Report:");
        for (CompanyShares shares : companySharesList) {
            System.out.println("Symbol: " + shares.getSymbol() + ", Shares: " + shares.getNumberOfShares());
        }
    }
}

public class StockAccountDemo1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockAccount stockAccount = new StockAccount();

        while (true) {
            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. Calculate Total Value");
            System.out.println("4. Print Report");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter stock symbol: ");
                    String buySymbol = scanner.nextLine();
                    System.out.print("Enter amount to buy: ");
                    int buyAmount = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    stockAccount.buy(buySymbol, buyAmount);
                    break;
                case 2:
                    System.out.print("Enter stock symbol: ");
                    String sellSymbol = scanner.nextLine();
                    System.out.print("Enter amount to sell: ");
                    int sellAmount = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    stockAccount.sell(sellSymbol, sellAmount);
                    break;

                case 3:
                    double totalValue = stockAccount.valueOf();
                    System.out.println("Total value of stocks: $" + totalValue);
                    break;

                case 4:
                    stockAccount.printReport();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

}
