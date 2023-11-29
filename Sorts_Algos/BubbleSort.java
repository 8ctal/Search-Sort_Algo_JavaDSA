package Sorts_Algos;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp = 0; // temporary variable for swapping
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = i+1; j < arr.length; j++) {
                // if current element is greater than next element
                if (arr[i] > arr[j]) {
                    // swap elements
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // if no elements were swapped, break
            if (!swapped) {
                break;
            }
        }
    }
}
