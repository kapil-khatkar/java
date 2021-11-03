import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("first number");
        int a = scanner.nextInt();
        System.out.println("second number");
        int b =scanner.nextInt();
        System.out.println("third number");
        int c = scanner.nextInt();
        int d = a+b+c;
        System.out.println(  +d);

    }
}
