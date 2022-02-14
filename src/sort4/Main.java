package algorithmization.sort4;
/* Сортировка обменами
Дана последовательность чисел a1  a2  an.Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа i i+1 a и a. Если ai  ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{100, 98, 2, 14, -45, 7, 78, -100};
        int swapCounter = 0;

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                    swapCounter++;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(swapCounter);
    }
}
