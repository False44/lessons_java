package first_lesson;

import java.util.Random;

/**
 * Created by ADMIN on 30.03.2017.
 */
public class ArraySumControl {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        Random random = new Random();
//        ((max - min) + 1) + min

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(41) + 10;
//                arr[i][j] = random.nextInt(11) - 5;
                if ((i + j) % 2 == 0) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }
}
