package learn_class;

import java.util.Random;
import static java.lang.System.out;
import static java.lang.Math.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();
        abs(-3);
        int maxValue = MAX_VALUE;
        int minValue = MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
                out.print(arr[i][j] + " ");
            }
            out.println();
            cos(12);

        }

        int sum = 0;
        int length = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];//sum of row
                sum += arr[j][i];//sum of column
            }
            out.println("SUM --> " + sum + "\nSR --> " + (sum * 1.0) / length);

            sum = 0;
        }


        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        out.println("MAX value of element of row --> " + max + "\nMIN --> " + min);
    }
}
