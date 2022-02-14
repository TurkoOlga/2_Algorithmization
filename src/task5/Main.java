package algorithmization.task5;
/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых а[i] > [i].

 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{80, 0, -15, -6, 0, 8, 10, 78, 100, 468};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i) {
                System.out.println(numbers[i]);
            }
        }
    }
}
