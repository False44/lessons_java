package first_lesson;


import java.util.Random;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] array1 = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {7, 8, 9, 6}
        };

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

//    array1[1][2] = 6

}