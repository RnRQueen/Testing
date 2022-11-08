/*Дан массив.
1. Составить программу расчета
 квадратного корня из любого элемента массива.
2. Найти среднее арифметическое двух любых элементов массива*/

import java.util.Random;

public class Main {
    static double[] array = {36.0, 0.0, 6.0, 102.0, -5.0, 110.0, 32.0, -16.0, 28.0, 100.0};

    public static void printArray(double[] array) {
        System.out.println("Задан массив чисел: ");
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

    public static double averageCalc(double[] numsArr, int n, int m) {
        double num1 = numsArr[n];
        double num2 = numsArr[m];
        double average = (num1 + num2) / 2;
        System.out.printf("Среднее арифетическое элементов %f и %f массива =  %f\n", num1, num2, average);
        return average;
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
            System.out.printf("Квадратный корень из элемента с индексом %d равного %.2f = %.2f\n", k, num, temp);
            return temp;
        }
    }

    public static void main(String[] args) {
        double[] rgnArray = generateArray(5);
        printArray(rgnArray);           //random array
        sqrtOfElement(rgnArray, 4);
        printArray(array);              //static array
        sqrtOfElement(array, 9);
        printArray(array);
        averageCalc(array, 0, 3);

    }

}
