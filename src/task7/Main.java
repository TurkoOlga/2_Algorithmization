package algorithmization.task7;
/*
Дана последовательность целых чисел 1 a2 an,. Образовать новую последовательность, выбросив из
исходной те члены, которые равны
min( a1 a2 , an)
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, -100, 8, 0, -98, -3, 55, -12, 0, -100};
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(numbers);
        int min = numbers[0];
        int count = getMinCount(copyNumbers, min);

        int[] result = new int[numbers.length - count];
        int indexResult = 0;
        for (int copyNumber : copyNumbers) {
            if (copyNumber != min) {
                result[indexResult] = copyNumber;
                indexResult++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    private static int getMinCount(int[] copyNumbers, int min) {
        int count = 0;
        for (int copyNumber : copyNumbers) {
            if (copyNumber == min) {
                count++;
            }
        }
        return count;
    }
}
