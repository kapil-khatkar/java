import java.util.Scanner;

public class LogicalOperators2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boys, girls;
        boys = sc.nextInt();
        girls = sc.nextInt();
        if (boys > 14 && girls < 40) {
            System.out.println("you can eligible");
        } else {
            System.out.println("you are not eligible");
        }
    }
}