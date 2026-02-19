public class ExpressionTest {
    public static void main(String[] args) {
        int a = -5 + 8 * 6;
        int b = (55 - 9) % 9;
        int c = 5 + 15 / 3 * 2 + 8 % 3;
        int d = 5 + 11 / 3 * 2 - 5 % 5;
        int e = -1 + 1 - 1 + 1 - 1 + 0 + 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
