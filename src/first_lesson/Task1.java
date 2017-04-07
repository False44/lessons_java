package first_lesson;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0) {
                System.out.println(arr[i] + " : " + arr[i + 1]);
                count++;
            }
        }
        System.out.println("countOfChildren = " + count);
    }
}
