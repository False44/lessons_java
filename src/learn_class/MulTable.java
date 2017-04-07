package learn_class;

/**
 * Created by ADMIN on 24.03.2017.
 */
public class MulTable {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                array[i][j] = j * i;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
