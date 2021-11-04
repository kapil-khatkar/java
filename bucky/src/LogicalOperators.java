import java.util.Scanner;

public class LogicalOperators{
    public static void main(String[] args) {
        Scanner kapil = new Scanner(System.in);
        int boys, girls, people, difference, division, module;
        boys  = 15;
        girls =  7;
        people = boys + girls;
        difference = boys - girls;
        division = boys / girls;
        module = boys % girls;
        System.out.println(people);
        System.out.println(difference);
        System.out.println(division);
        System.out.println(module);
    }
}
