import java.util.*;

public class volumeCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();  
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double volume = calculateVolume(radius, height);  
        System.out.println("The volume of the cylinder is: " + volume);
        
        scanner.close();
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
