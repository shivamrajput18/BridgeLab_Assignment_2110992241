import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); 

        double area = calculateArea(radius);      
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
