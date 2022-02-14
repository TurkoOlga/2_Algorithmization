package sort1;

import java.util.ArrayList;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.

 */


public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 6, 7, 6, 7};
        int[] secondArray = new int[]{-1, -2, -2};
        int k = 2;

        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        for (int value : firstArray) {
            arrayOfNumbers.add(value);
        }

        for (int j : secondArray) {
            arrayOfNumbers.add(k + 1, j);
            k++;
        }

        for (Integer arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + ", ");
        }
    }
}