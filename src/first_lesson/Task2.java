package first_lesson;

/*1) Создать два массива из 30 чисел. Первый массив проинициализировать нечетными числами.
        Проинициализировать второй массив элементами первого массива при условии,
        что индекс элемента больше 4 и делится без остатка на 5 и элемент больше 0, но меньше 6 или больше 10, но меньше 20.
        Если условие не выполняется оставить элемент массива без изменения.*/

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[30];
        int[] arr2 = new int[30];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2 + 1;
            System.out.print(arr1[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            int element = arr1[i];
            if (i > 4 && i % 5 == 0 && ((element > 0 && element < 6) || (element > 10 && element < 20))) {
                arr2[i] = element;
            }
            System.out.print(arr2[i] + "\t");
        }

    }

}

//if(one && two)
//if(one || two)
