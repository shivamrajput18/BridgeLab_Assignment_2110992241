import java.util.Scanner;

public class powerCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
