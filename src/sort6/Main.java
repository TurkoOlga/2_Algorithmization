package sort6;

import java.util.Arrays;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента
ai и ai+1
. Если
ai  ai+1
, то продвигаются
на один элемент вперед. Если
ai  ai+1
, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.

 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2, -90, 7, 45, -23, 0, 23, -12, 10, 1000, 88};

        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
                counter++;

                for (int j = i - 1; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        counter++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}