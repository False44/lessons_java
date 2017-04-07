package learn_wrapper;

public class LearnWrapper {
    public static void main(String[] args) {
        int a = 5;//new Integer(5)
        short s = 6;
        int b = 15;
        int i = Integer.parseInt("15");
        int compare = Integer.compare(a, b);


        Integer d = 10;

        Integer integer = new Integer(5);
        Integer integer1 = new Integer(5);

//        System.out.println(integer == integer1);

        Integer c = Integer.valueOf(10);

        System.out.println(d == c);

        d = a;//new Integer(5) int -> Integer autoboxing

        a = d;//Integer -> int -> unboxing
    }
}
