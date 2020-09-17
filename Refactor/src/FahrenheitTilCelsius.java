import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {
DanskFahrenheitTilCelsius();
    }

    public static void DanskFahrenheitTilCelsius() {

    Scanner input = new Scanner(System.in);

        System.out.print("Skriv grader i Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Konverter Fahrenheit til Celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
    celsius + " i Celsius");

    }
}