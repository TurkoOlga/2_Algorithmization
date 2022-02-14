package algorithmization.task10;
/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Main {

    public static void main(String[] args) {
        int[][] numbers = {
                {-10, 99, 23, 56, 4, 9},
                {9, 3, 66, -244, 8, 0},
                {77, 2, 5, 0, -45, 0}
        };

        for (int i = 0; i < numbers[0].length; i++) {
            if ((i % 2 == 1) && (numbers[2][i] < numbers[0][i])) {
                for (int[] number : numbers) {
                    System.out.println(number[i]);
                }
            }
        }
    }

}