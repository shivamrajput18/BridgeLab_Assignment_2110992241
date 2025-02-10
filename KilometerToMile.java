import java.util.Scanner;

public class KilometerToMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = convertToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close();
    }

    public static double convertToMiles(double kilometers) {
        return kilometers * 0.621371;
    }
}
