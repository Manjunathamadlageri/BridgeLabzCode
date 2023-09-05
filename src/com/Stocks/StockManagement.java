package com.Stocks;

    import java.util.Scanner;

    class Stock {
        String name;
        int numberOfShares;
        double sharePrice;

        public Stock(String name, int numberOfShares, double sharePrice) {
            this.name = name;
            this.numberOfShares = numberOfShares;
            this.sharePrice = sharePrice;
        }

        public double calculateStockValue() {
            return numberOfShares * sharePrice;
        }
    }

    public class StockManagement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of stocks: ");
            int numStocks = scanner.nextInt();

            Stock[] stocks = new Stock[numStocks];

            for (int i = 0; i < numStocks; i++) {
                System.out.println("Enter details for Stock " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Number of shares: ");
                int numberOfShares = scanner.nextInt();
                System.out.print("Share price: ");
                double sharePrice = scanner.nextDouble();

                stocks[i] = new Stock(name, numberOfShares, sharePrice);
            }

            double totalPortfolioValue = 0;

            System.out.println("\nStock Report:");
            for (Stock stock : stocks) {
                double stockValue = stock.calculateStockValue();
                totalPortfolioValue += stockValue;
                System.out.println("Stock: " + stock.name +
                        ", Total Value: " + stockValue);
            }

            System.out.println("\nTotal Portfolio Value: " + totalPortfolioValue);
        }
    }


