package algorithmization.task3;
/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.

 */

public class ElementsCounter {

    private int positiveElements = 0;
    private int negativeElements = 0;
    private int zeroElements = 0;

    public void defineElement(int number) {
        if (number < 0) {
            negativeElements++;
        } else if (number == 0) {
            zeroElements++;
        } else {
            positiveElements++;
        }
    }

    public int getPositiveElements() {
        return positiveElements;
    }

    public int getNegativeElements() {
        return negativeElements;
    }

    public int getZeroElements() {
        return zeroElements;
    }

}
