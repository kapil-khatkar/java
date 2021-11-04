import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner kapil = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("first number ");
        fnum = kapil.nextDouble();
        System.out.println("second number ");
        snum = kapil.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}