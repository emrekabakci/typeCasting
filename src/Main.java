import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined.
        double doubleCast;
        int intCast;

        //Scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Enter integer value: ");
        int intNum = inp.nextInt();
        System.out.print("Enter double value: ");
        double doubleNum = inp.nextDouble();

        //Data type changed.
        doubleCast = intNum;
        intCast = (int) doubleNum;

        //Result printed.
        System.out.println("Int changed to double: " + doubleCast);
        System.out.println("Double changed to int: " + intCast);
    }
}