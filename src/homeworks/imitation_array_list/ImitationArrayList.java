package homeworks.imitation_array_list;

import java.util.Arrays;

public class ImitationArrayList {
    private int[] array;//0
    private int count = 0;

    public ImitationArrayList() {
        array = new int[1];
    }

    public void addValue(int element) {
        resize("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                count++;
                break;
            }
        }
    }

    private void resize(String str) {
        int[] arraySafe = new int[array.length * 2];
        if (count == array.length) {
            for (int i = 0; i < array.length; i++) {
                arraySafe[i] = array[i];
            }
            array = arraySafe;
            count = 0;
        }
    }

    public void change(int number, int index) {
        array[index] = number;
    }

    public void delete(int index) {//rewrite
        for (int i = 0; i < array.length; i++) {
            array[index] = 0;
        }
    }

    public void addElemnts(int num) {//rewrite name and parameters
        int[] arr = new int[array.length + num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        array = arr;
    }

    public void subElemnts(int num) {//rewrite
        int[] arr = new int[array.length - num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
//        return arr;
    }

    public void sort(int[] arr) {//rewrite
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
