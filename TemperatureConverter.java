import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double temperature;
    char scale;

    System.out.print("Enter the temperature: ");
    temperature = input.nextDouble();
    input.nextLine();
    System.out.print("Enter the temperature scale (C, F, or K): ");
    scale = input.nextLine().charAt(0);

    if (scale == 'C' || scale == 'c') {
      System.out.println(temperature + " degrees Celsius is equivalent to " +
                         celsiusToFahrenheit(temperature) + " degrees Fahrenheit and " +
                         celsiusToKelvin(temperature) + " Kelvin.");
    } else if (scale == 'F' || scale == 'f') {
      System.out.println(temperature + " degrees Fahrenheit is equivalent to " +
                         fahrenheitToCelsius(temperature) + " degrees Celsius and " +
                         fahrenheitToKelvin(temperature) + " Kelvin.");
    } else if (scale == 'K' || scale == 'k') {
      System.out.println(temperature + " Kelvin is equivalent to " +
                         kelvinToCelsius(temperature) + " degrees Celsius and " +
                         kelvinToFahrenheit(temperature) + " degrees Fahrenheit.");
    } else {
      System.out.println("Invalid temperature scale. Please enter C, F, or K.");
    }
  }

  public static double celsiusToFahrenheit(double temperature) {
    return (temperature * 9.0 / 5.0) + 32;
  }

  public static double celsiusToKelvin(double temperature) {
    return temperature + 273.15;
  }

  public static double fahrenheitToCelsius(double temperature) {
    return (temperature - 32) * 5.0 / 9.0;
  }

  public static double fahrenheitToKelvin(double temperature) {
    return (temperature + 459.67) * 5.0 / 9.0;
  }

  public static double kelvinToCelsius(double temperature) {
    return temperature - 273.15;
  }

  public static double kelvinToFahrenheit(double temperature) {
    return (temperature * 9.0 / 5.0) - 459.67;
  }
}
