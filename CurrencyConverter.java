import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    // Map to store exchange rates relative to USD
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Exchange rates relative to USD
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("INR", 74.0);
        exchangeRates.put("AUD", 1.35);
        exchangeRates.put("CAD", 1.25);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("CNY", 6.45);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // User input for source currency
        System.out.print("Enter the source currency (e.g., USD, EUR, GBP): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        // User input for target currency
        System.out.print("Enter the target currency (e.g., USD, EUR, GBP): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // User input for amount to be converted
        System.out.print("Enter the amount to be converted: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid amount entered. Please enter a valid number.");
            return;
        }
        double amount = scanner.nextDouble();

        // Validate currencies
        if (!exchangeRates.containsKey(sourceCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency entered. Please check the currency codes.");
            return;
        }

        // Conversion
        double convertedAmount = convertCurrency(sourceCurrency, targetCurrency, amount);
        System.out.printf("%.2f %s is equal to %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }

    // Method to convert currency
    public static double convertCurrency(String sourceCurrency, String targetCurrency, double amount) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        return amount * (targetRate / sourceRate);
    }
}
