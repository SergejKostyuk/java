// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class UniqElements {
public static void main(String[] args) {
int arrayLength = 1000;
int maxValue = 500;

int[] array = createArray(arrayLength, maxValue);
System.out.println(getUniqElementsPercent(array));
}

private static int[] createArray(int arrayLength, int maxValue) {
Random random = new Random();

int[] array = new int[arrayLength];
for (int index = 0; index < arrayLength; index++) {

array[index] = random.nextInt(maxValue + 1);
}
return array;
}

private static double getUniqElementsPercent(int[] array) {
Set<Integer> uniqElements = new HashSet<>();
for (int element : array) {
uniqElements.add(element);
}
return (double)uniqElements.size() * 100 / array.length;
}
}