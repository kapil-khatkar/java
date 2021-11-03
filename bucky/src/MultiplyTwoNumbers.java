import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner multiply = new Scanner(System.in);
        System.out.println("first number");
        int firstNumber = multiply.nextInt();
        System.out.println("second number");
        int secondNumber = multiply.nextInt();
        int product = firstNumber * secondNumber;
        System.out.println("product");
        System.out.println(product);
    }
}
