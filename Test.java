import Sorts_Algos.*;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Test {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //BUBBLE SORT
        //create an array
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method bubble sort
        BubbleSort.bubbleSort(arr);
        System.out.println("\nArray After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //SELECTION SORT
        arr = new int[]{5, 4, 7, 2, 71, 567, 24, 6, 8, 9, 1, 3, 0};
        System.out.println("\nArray Before Selection Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method selection sort
        SelectionSort.selectionSort(arr);
        System.out.println("\nArray After Selection Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //INSERTION SORT
        arr = new int[]{34, 0, -5, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("\nArray Before Insertion Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method insertion sort
        InsertionSort.insertionSort(arr);
        System.out.println("\nArray After Insertion Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        //COUNTING SORT
        arr = new int[]{34, 0, -5, 2, 45, 235, 65, 3, 76, 3};
        System.out.println("\nArray Before Counting Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method counting sort
        startTime = System.nanoTime();
        CountingSort.countingSort(arr);
        System.out.println("\nTime taken by Counting Sort: " + (System.nanoTime() - startTime) + " nanoseconds");
        System.out.println("Array After Counting Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //SHELL SORT
        arr = new int[]{34, 0, -5, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("\nArray Before Shell Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method shell sort
        ShellSort.shellSort(arr);
        System.out.println("\nArray After Shell Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //RADIX SORT
        arr = new int[]{345, 178, 539, 531, 269};
        System.out.println("\nArray Before Radix Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method radix sort
        startTime = System.nanoTime();
        RadixSort.radixSort(arr);
        System.out.println("\nTime taken by Radix Sort: " + (System.nanoTime() - startTime) + " nanoseconds");
        System.out.println("Array After Radix Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        //QUICK SORT
        arr = new int[]{34, 0, -5, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nArray Before Quick Sort");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        //call the method quick sort
        QuickSort.quickSort(arr);
        System.out.println("\nArray After Quick Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        startTime = System.nanoTime();
        System.out.println("\nSum of 1000000 numbers using IntStream: " + sum(100000000) + " Time taken by this function: " + (System.nanoTime() - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Sum of 1000000 numbers using formula: " + sumThen(100000000) + " Time taken by this function: " + (System.nanoTime() - startTime) + " nanoseconds");
    }

    public static long sum(long n) {
        return LongStream.rangeClosed(1, n).sum();
    }

    public static long sumThen(long n) {
        return n * (n + 1) / 2;
    }

}
