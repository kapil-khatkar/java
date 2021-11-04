import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        if (test >= 6) {
            System.out.println("apple is fruit");
        } else {
            System.out.println("apple is good for health");
        }
    }
}