public class IncDec {
    public static void main(String[] args) {
        int x = 42;
        int y;

        y = x++;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        int a = 0;
        int b;

        b = a++ + a++;
        System.out.println(b);
        System.out.println(a);
        System.out.println(++b);
    }
}
