package first_lesson;

import java.util.Random;

public class ArrayLastLine {
    public static void main(String[] args) {
        int length = 5;
        int[][] arr = new int[length][length];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }

        int sumFirstLine = 0;
        int sumLastLine = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumFirstLine += arr[0][j];
                sumLastLine += arr[length - 1][j];
            }
        }

        System.out.println("Sum first line -> " + sumFirstLine + "\n Sum last line -> " + sumLastLine);
    }
}
