/*Дан массив.
Определить:
1. Максимальный элемент массива
2. Минимальный элемент массива
3. На сколько максимальный элемент больше минимального
4. Индекс максимального элемента
5. Индекс минимального элемента
*/

import java.util.Random;

public class Main {

    public static double[] generateArray(int n) {

        double[] randomNums = new double[n];
        Random r = new Random();

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextDouble() * 100;
        }
        return randomNums;
    }

    public static void printArray(double[] array) {
        System.out.println("There is an array of random numbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();
        int indexMax = indexOfMax(array);
        System.out.printf("%d is index of maximum\n", indexMax);
        int indexMin = indexOfMin(array);
        System.out.printf("%d is index of minimum\n", indexMin);
        double max = maxElement(array);
        System.out.printf("%.2f is maximum\n", max);
        double min = minElement(array);
        System.out.printf("%.2f is minimum\n", min);
        howMuchBigger(max, min);
    }

    public static double maxElement(double[] array) {
        int index = indexOfMax(array);
        double max = array[index];
        return max;
    }

    public static double minElement(double[] array) {

        int index = indexOfMin(array);
        double min = array[index];

        return min;
    }

    public static double howMuchBigger(double max, double min) {
        double result = max - min;
        System.out.printf("Maximum is bigger than minimum by %.2f \n", result);

        return result;
    }

    public static int indexOfMax(double[] array) {
        double max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }

        }

        return indexMax;
    }

    public static int indexOfMin(double[] array) {
        double min = array[0];
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }

        }

        return indexMin;
    }

    public static void main(String[] args) {
        double[] rgnArray = generateArray(5);
        printArray(rgnArray);


    }
}
