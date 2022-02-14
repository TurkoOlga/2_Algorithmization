package task9;

import java.util.Arrays;

/*
 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 7, 9, 2, -4, -77, 9, 1000};

        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % 2 == 0) {
                numbers[i] = 0;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
