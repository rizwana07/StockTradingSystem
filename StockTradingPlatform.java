import java.util.Scanner;

public class StockTradingPlatform {
    public static void main(String[] args) {
        // Create some sample stocks
        Stock stock1 = new Stock("Apple", 150.0);
        Stock stock2 = new Stock("Google", 2800.0);
        Stock stock3 = new Stock("Tesla", 650.0);

        // Create a portfolio to track owned stocks
        Portfolio portfolio = new Portfolio();

        // Start interaction with user
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nStock Trading Platform");
            System.out.println("1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Buy stock
                    System.out.print("Enter stock name (Apple, Google, Tesla): ");
                    String buyStock = scanner.next();
                    System.out.print("Enter quantity: ");
                    int buyQuantity = scanner.nextInt();
                    if (buyStock.equalsIgnoreCase("Apple")) {
                        portfolio.addStock(stock1.getName(), buyQuantity);
                    } else if (buyStock.equalsIgnoreCase("Google")) {
                        portfolio.addStock(stock2.getName(), buyQuantity);
                    } else if (buyStock.equalsIgnoreCase("Tesla")) {
                        portfolio.addStock(stock3.getName(), buyQuantity);
                    } else {
                        System.out.println("Stock not available.");
                    }
                    break;
                case 2:
                    // Sell stock
                    System.out.print("Enter stock name (Apple, Google, Tesla): ");
                    String sellStock = scanner.next();
                    System.out.print("Enter quantity: ");
                    int sellQuantity = scanner.nextInt();
                    if (sellStock.equalsIgnoreCase("Apple")) {
                        portfolio.removeStock(stock1.getName(), sellQuantity);
                    } else if (sellStock.equalsIgnoreCase("Google")) {
                        portfolio.removeStock(stock2.getName(), sellQuantity);
                    } else if (sellStock.equalsIgnoreCase("Tesla")) {
                        portfolio.removeStock(stock3.getName(), sellQuantity);
                    } else {
                        System.out.println("Stock not available.");
                    }
                    break;
                case 3:
                    // View portfolio
                    portfolio.displayPortfolio();
                    break;
                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the platform...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}