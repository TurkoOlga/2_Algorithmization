package algorithmization.task2;
/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-300, -60, -15, -6, 0, 8, 10, 78, 100, 468};
        int[] updatedNumbers = new int[numbers.length];

        int substitute = 10;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > substitute) {
                updatedNumbers[i] = substitute;
                count++;
            } else {
                updatedNumbers[i] = numbers[i];
            }
        }

        System.out.println(Arrays.toString(updatedNumbers));
        System.out.println("Количество замен: " + count);
    }
}
