import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while (counter < 100) {
            System.out.println("counting from 1 to 99");
            System.out.println(counter);
            counter++;
        }
    }
}