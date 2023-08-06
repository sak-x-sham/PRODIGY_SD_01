import java.util.Scanner;

public class TemperatureConverter {
    // creating all the methods to change temperature.
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    // creating main method.
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Temperature Converter Program");
        System.out.println("-------------------------------------------------------------------------");

        System.out.print("Enter the temperature value: ");
        double temperature = keyboardInput.nextDouble(); // taking input from user.

        System.out.println("\n"); // for better spacing in output

        System.out.print(
                "Enter the original unit of measurement\nType 'C' for degree Celsius\nType 'F' for Fahrenheit\nType 'K' for Kelvin : ");
        String originalUnit = keyboardInput.next().toUpperCase(); // taking String input and changing it to uppercase
                                                                  // for
        // using it in Switch case conditions.

        System.out.println(); // for spacing.

        // initializing Temperature variables with default values in decimal;
        double celsiusValue = 0.0;
        double fahrenheitValue = 0.0;
        double kelvinValue = 0.0;

        // using Switch Case for different units.
        switch (originalUnit) {
            case "C":
                celsiusValue = temperature; // changing default temperature values with the input from the user.
                fahrenheitValue = celsiusToFahrenheit(temperature);
                kelvinValue = celsiusToKelvin(temperature);
                System.out.printf("%.2f %s is equal to:\n", temperature, originalUnit);
                System.out.printf("%.2f Fahrenheit\n", fahrenheitValue);
                System.out.printf("%.2f Kelvin\n", kelvinValue);
                break;

            case "F":
                fahrenheitValue = temperature;
                celsiusValue = fahrenheitToCelsius(temperature);
                kelvinValue = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f %s is equal to:\n", temperature, originalUnit);
                System.out.printf("%.2f Celsius\n", celsiusValue);
                System.out.printf("%.2f Kelvin\n", kelvinValue);
                break;

            case "K":
                kelvinValue = temperature;
                celsiusValue = kelvinToCelsius(temperature);
                fahrenheitValue = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f %s is equal to:\n", temperature, originalUnit);
                System.out.printf("%.2f Celsius\n", celsiusValue);
                System.out.printf("%.2f Fahrenheit\n", fahrenheitValue);
                break;

            // creating a default case for invalid input.
            default:
                System.out.println("Invalid unit of measurement. Please use C, F, or K.");

        }
        keyboardInput.close();
    }
}
