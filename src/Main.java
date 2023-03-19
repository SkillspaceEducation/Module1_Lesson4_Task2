/*
Создайте переменную для массива из 10 элементов.
Заполните его произвольными значениями целочисленного типа.
Найдите максимальный элемент и выведите его индекс.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int arrayInitLen = 10;
        int[] arrayInit = new int[arrayInitLen];
        Random rand = new Random();
        for (int i = 0; i < arrayInit.length; i++) {
            arrayInit[i] = rand.nextInt(50);
        }
        System.out.println("Исходный массив\n" + Arrays.toString(arrayInit));
        int maxRand = 0;
        int numMaxRand = 0;
        for (int i = 0; i < arrayInit.length; i++) {
            if (arrayInit[i] > maxRand) { // Находим максимальный элемент массива и его индекс
                maxRand = arrayInit[i];
                numMaxRand = i;
            }
        }
        System.out.printf("Максимальный элемент массива имеет индекс %d и равен %d", numMaxRand, maxRand);
    }
}