package task8;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4};
        Arrays.sort(numbers);

        Map<Integer, Integer> numberToCount = getNumberToCount(numbers);
        System.out.println(numberToCount);

        int maxValue = Integer.MIN_VALUE;
        int minKey = Integer.MAX_VALUE;

        for (Integer key : numberToCount.keySet()) {
            Integer value = numberToCount.get(key);
            if (value > maxValue) {
                maxValue = value;
                minKey = key;
            } else if (value == maxValue) {
                if (key < minKey) {
                    minKey = key;
                }
            }
        }
        System.out.println("Наименьшее число из наиболее часто встречающихся: " + minKey);
    }

    private static Map<Integer, Integer> getNumberToCount(int[] numbers) {
        int counterFirst = 1;
        Map<Integer, Integer> numberToCount = new HashMap<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            int counterSecond = 0;
            if (numbers[i + 1] == numbers[i]) {
                counterFirst++;
                if (i + 1 >= numbers.length - 1) {
                    numberToCount.put(numbers[i], counterFirst);
                }
            } else {
                counterSecond++;
                numberToCount.put(numbers[i], counterFirst);
                counterFirst = counterSecond;
            }
        }
        return numberToCount;
    }
}

