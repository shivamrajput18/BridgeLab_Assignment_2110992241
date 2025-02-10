import java.util.*;

public class addTwoNumbers {
   public static int addTwoNumber(int firstNumber,int secondNumber){
       return firstNumber + secondNumber;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int result = addTwoNumber(firstNumber,secondNumber);
        System.out.println(result);
    }
}
