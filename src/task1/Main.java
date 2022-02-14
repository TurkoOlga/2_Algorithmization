package algorithmization.task1;
/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */


public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 48, 9, 4567, 4545, 78, 23, 6};
        int divider = 4;
        int sum = 0;

        for (int number : numbers) {
            if (number % divider == 0) {
                System.out.println("Число " + number + " кратно " + divider);
                sum += number;
            }
        }
        System.out.println("Сумма чисел, кратных " + divider + ", равна " + sum);
    }
}
