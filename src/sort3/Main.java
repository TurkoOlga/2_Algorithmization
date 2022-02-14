package algorithmization.sort3;
/*
3. Сортировка выбором. Дана последовательность чисел
a1  a2  an
.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = new int[]{4, 7, 1, 4, 2, 99, -3, 19, -25, 100};

        for (int max = 0; max < inputArray.length - 1; max++) {
            int index = max;
            for (int j = max + 1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[max]) {
                    index = j;
                }
            }
            int tmp = inputArray[max];
            inputArray[max] = inputArray[index];
            inputArray[index] = tmp;
        }

        System.out.println(Arrays.toString(inputArray));
    }
}

