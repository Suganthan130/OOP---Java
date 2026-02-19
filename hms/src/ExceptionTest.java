import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        double a = 10.0;
        int b = 0;
        double div = a / b;
        System.out.println("Result of 10.0 / 0: " + div);

        try {
            System.out.println("Trying integer division 10/0:");
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException for integer division.");
        }
    }
}
