package dsa.array.sorting.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {22, 64, 11, 2, 94, 81};
        //22, 64, 11, 2, 94, 81
        //2,  64, 11, 22, 94,81
        //2,  22, 11, 64, 94,81
        //2,  22, 11, 22, 94,81

        int n = arr.length;
        for(int i=0; i < n-1 ; i++  ){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[minIndex]){

                    minIndex=j;
                    System.out.println("i:"+i + "and j:"+j + "   minIndex: "+minIndex);


                }


            }
            int temp = arr[i]; //11
            arr[i] = arr[minIndex]; //
            arr[minIndex]= temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}
