package learn_class;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class TASK6 {//rewrite
    public static void main(String[] args) {
        add(5, 10);
    }

    static void mul(int a, int b) {
        int s = 0;
        s = a * b;
        System.out.println(s);
    }

    static void divide(int a, int b) {
        System.out.println((a * 1.0) / b);
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void sub(int a, int b) {
        int s = 0;
        s = a - b;
        System.out.println(s);
    }
}
