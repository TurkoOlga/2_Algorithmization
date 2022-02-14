package sort2;
/*
2. Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <= ... <= bm.
 Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не использовать.

 */

public class Main {
    public static void main(String[] args) {
        int[] left = {-1, 2, 6, 10};
        int[] right = {0, 2, 4};

        int[] result = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex + rightIndex < result.length) {
            if (rightIndex == right.length ||
                    leftIndex != left.length && left[leftIndex] < right[rightIndex]) {
                result[leftIndex + rightIndex] = left[leftIndex++];
            } else {
                result[leftIndex + rightIndex] = right[rightIndex++];
            }
        }

        for (int j : result) {
            System.out.print(j + "  ");
        }
    }
}
