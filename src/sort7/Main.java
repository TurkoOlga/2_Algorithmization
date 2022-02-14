package algorithmization.sort7;
/*
7. Пусть даны две неубывающие последовательности действительных чисел
a1  a2  an и b1  b2  bm. Требуется указать те места, на которые нужно вставлять элементы последовательности
b1  b2  bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {-10, -5, -1, 0, 3, 6, 9, 23, 34, 55, 100};
        int[] secondArray = {-13, -8, -2, 2, 4, 8, 10, 36, 67, 55, 88};

        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MIN_VALUE;
        for (int k : firstArray) {
            for (int i : secondArray) {
                if (i > min && i < k) {
                    result.add(i);
                }
            }
            min = k;
            result.add(k);
        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
