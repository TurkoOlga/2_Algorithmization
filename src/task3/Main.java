package algorithmization.task3;
/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.

 */

public class Main {
    public static void main(String[] args) {
        ElementsCounter counter = new ElementsCounter();

        int[] realNumbers = new int[]{-18, 39784, 0, 0, -1, 88, 44, -12, 1, 2, 3, 4, 5,};
        for (int realNumber : realNumbers) {
            counter.defineElement(realNumber);
        }

        printResult(counter);
    }

    private static void printResult(ElementsCounter counter) {
        System.out.println("Количество отрицательных элементов " + counter.getNegativeElements());
        System.out.println("Количество положительных элементов " + counter.getPositiveElements());
        System.out.println("Количество нулевых элементов " + counter.getZeroElements());
    }
}
