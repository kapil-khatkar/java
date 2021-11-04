import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner bean = new Scanner(System.in);
        int test = bean.nextInt();
        if (test >= 6) {
            System.out.println("apple is fruit");
        } else {
            System.out.println("apple is good for health");
        }
    }
}