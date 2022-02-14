package algorithmization.sort5;
/*
5. Сортировка вставками. Дана последовательность чисел
n a ,a , ,a 1 2 . Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть
a a ai, , , 1 2  - упорядоченная последовательность, т. е. a1  a2  an. Берется следующее число
i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 8, 10, 6, 50, 38, 40, 49};

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int low = 0;
                int high = i - 1;
                int key = array[i];
                int indexOfPaste = getPasteIndex(array, key, low, high);

                for (int j = i - 1; j >= indexOfPaste; j--) {
                    array[j + 1] = array[j];
                }
                array[indexOfPaste] = key;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static int getPasteIndex(int[] sortedArray, int key, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return sortedArray[low] > key ? low : low + 1;
    }
}

