package Sorts_Algos;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] array) {
        int max = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp);
        }
    }

    private static void countSort(int[] array, int exp) {
        int[] count = new int[10];
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[(array[i] / exp) % 10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
}
