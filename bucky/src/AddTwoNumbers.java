import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("second number ");
        int secondNumber =scanner.nextInt();
        System.out.println("third number ");
        int thirdNumber = scanner.nextInt();
        int total = firstNumber + secondNumber + thirdNumber;
        System.out.println(total);

    }
}
