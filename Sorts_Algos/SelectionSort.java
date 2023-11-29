package Sorts_Algos;

public class SelectionSort {

    public static void selectionSort(int[] array){
        int temp = 0;
        int min = 0;
        for(int i = 0; i < array.length; i++){
            min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
