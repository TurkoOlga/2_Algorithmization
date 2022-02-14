package algorithmization.task6;
/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[]{-666.4, 6.5, 7, -19.0, -4.0, 23.785, 99.99, 1.0, -99.99};
        double sum = 0;

        for (int index = 1; index < numbers.length; index++) {
            int count = 0;

            for (int divider = 2; divider < index + 1; divider++) {
                if ((index + 1) % divider == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                sum += numbers[index];
            }
        }
        System.out.println(sum);
    }
}