package learn_scanner;

import java.util.Scanner;

/**
 * Created by ADMIN on 24.03.2017.
 */
public class LearnScanner {
    public static void main(String[] args) {
        System.out.println("Please, enter some word");
        Scanner scanner = new Scanner(System.in);

//        String user = scanner.nextLine();
        int user = scanner.nextInt();
        short s = 12;

        Integer i = 5;
        Short aShort = 45;
//        Integer.parseInt("78");

        int a = 10;
        Integer d = 15;//new Integer(15)

        a = d;//unboxing
        d = a;//new Integer(10)


        System.out.println(".....");
        System.out.println(user);
    }
}
