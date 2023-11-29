package Sorts_Algos;

public class ShellSort {

    public static void shellSort(int[] array){
        int temp = 0;
        int j = 0;
        for(int gap = array.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i++){
                temp = array[i];
                j = i;
                while(j >= gap && array[j-gap] > temp){
                    array[j] = array[j-gap];
                    j -= gap;
                }
                array[j] = temp;   // put temp (the original a[i]) in its correct location
            }
        }
    }
}
