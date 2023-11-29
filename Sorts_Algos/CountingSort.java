package Sorts_Algos;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int[] count = new int[max - min + 1]; // count array
        for (int k : array) { // count occurences of each element
            count[k - min]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i + min;
                j++;
                count[i]--;
            }
        }
    }
}
