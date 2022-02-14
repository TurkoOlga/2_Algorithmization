package algorithmization.task4;
/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1010, 39, 0, -5, 900, -34, 99, 4, 9, 5, -13, -19, 88, 0};
        Arrays.sort(numbers);

        int min = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = min;

        System.out.println(Arrays.toString(numbers));
    }
}
