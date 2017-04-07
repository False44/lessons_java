package learn_class;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ADMIN on 24.03.2017.
 */
public class ArraySort {
    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = new int[]{0, 1, 0, 2, 3};
        Random random = new Random();

        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }*/

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

        /*for (int i = arr.length; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; ++j) {
                if (arr[j] == 0 && arr[j + 1] > 0) {
                    int tmp = arr[j];

                } arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
        }*/

        /*for (int i = 32766; i <= 32767; i++) {
            System.out.println(i);
        }*/

//        System.out.println(Arrays.toString(arr));
    }
}


