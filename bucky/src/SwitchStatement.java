import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        switch (age) {
            case 12 -> System.out.println("you are a kid");
            case 16 -> System.out.println("you are a good student");
            case 18 -> System.out.println("you are at adult age");
            case 24 -> System.out.println("you are young");
            case 35 -> System.out.println("you are senior citizen");
            case 60 -> System.out.println("you are old");
            case 70 -> System.out.println("you are near to death");
            default -> System.out.println("you are a Human being and world dont need you");
        }
    }
}