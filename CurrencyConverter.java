import java.util.Scanner;

public class CurrencyConverter {
  
  public static double exchangeRate = 0.91;
  
  public static double convert(double amount) {
    return amount * exchangeRate;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter amount in USD: ");
    double amount = scanner.nextDouble();
    double convertedAmount = convert(amount);
    System.out.println("Converted amount in EUR: " + convertedAmount);
  }

}
