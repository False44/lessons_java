package learn_class;

import java.util.Random;

/**
 * Created by ADMIN on 24.03.2017.
 */
public class DimArrTas {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        int count = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j] % 10;//rewrite
                System.out.println(sum);
            }
        }

    }
}
