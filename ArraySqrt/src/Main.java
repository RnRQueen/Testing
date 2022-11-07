/*Дан массив. Составить программу расчета
 квадратного корня из любого элемента массива*/

import java.util.Random;

public class Main {
    static double[] array = {36, 0, 6, 102, -5, 110, 32, -16, 28, 100};

    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();

    }

    public static double[] generateArray(int n) {

        double[] randomNums = new double[n];
        Random r = new Random();

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextDouble() * 100;
        }

        return randomNums;
    }


    public static double sqrtOfElement(double[] numbers, int k) {
        if ((k < 0) || (k >= numbers.length)) {
            System.out.println("Индекс за пределами массива");
            return -1;
        } else {
            double num = numbers[k];
            if (num < 0) {
                throw new IllegalStateException("Невозмоно вычислить корень из отрицательного числа!");
            }

            double temp = Math.sqrt(num);
            System.out.printf("Корень из %.2f = %.2f\n", num, temp);
            return temp;
        }
    }

    public static void main(String[] args) {
        double[] rgnArray = generateArray(5);
        printArray(rgnArray);           //random array
        sqrtOfElement(rgnArray, 4);
        printArray(array);              //static array
        sqrtOfElement(array, 9);


    }

}
