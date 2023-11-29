package Sorts_Algos;

public class InsertionSort {

    public static void insertionSort(int[] array){
        int temp = 0;
        int j = 0;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
