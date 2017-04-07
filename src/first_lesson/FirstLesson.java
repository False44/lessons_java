package first_lesson;

import java.util.Random;

/**
 * Created by ADMIN on 19.01.2017.
 */
public class FirstLesson {
    public static void main(String[] args) {
//        System.out.println("Hello");

       /* byte b = 1;//8 bit
        int a = 1200;//32 bits
        short s = 1200;//16 bits
        byte c = (byte) (b + 1);
        short d = (short) (s + 1);
        long l = 12000L;
        float f = 12.0F;
        double g = 14.5;
        boolean h = true;//false
        char ch = '\u0059';
        char ch1 = 'Y';
        char ch2 = 89;
        System.out.println(ch2);*/

        //condition ?  (statement if condition if true) : (statement if condition if false)

        int a = (1 == 1) ? 15 : 20;

        int b = 10;

//        int c = ++b + b++;
        int c = ++b + b++ + ++b + b++;//11+11+13+13

        System.out.println(b);
        System.out.println(c);

     /*

      int[] array = new int[10];//0
        int[] array1 = {1, 2, 3, 4};
//        array1[4] = 5;
        int[] array2 = new int[]{1, 2, 3, 4};
        array2[4] = 5;*/



        /*for(int i = 0; i < array.length; ++i){
            int element = array[i];
            System.out.println(element);
        }

        for(int element : array){
            System.out.println(element);
        }

        Random random = new Random();

        int a = random.nextInt(50);

        for(int i = 0; i < array.length; ++i){
            array[i] = random.nextInt(50);
        }*/
    }
}
