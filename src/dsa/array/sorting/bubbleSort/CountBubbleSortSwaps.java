package dsa.array.sorting.bubbleSort;

import java.util.Arrays;

public class CountBubbleSortSwaps {

    //start with first element and compare it with next
    //if the current element is greater then swap them
    //move to next element and repeat the process for entire array
    //after each pass the largest elements moves to its correct position
    //Repeat the process for the remaining unsorted part until no swaps are required

    public static void main(String[] args) {
        int[] arr = {22, 64, 11, 2, 94, 81};

        
        
        int n = arr.length;
        int swaps = 0;


        for (int i = 0; i < n - 1; i++) {


            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }


        }
        System.out.println("Number of Swaps: "+swaps);
    }
}
