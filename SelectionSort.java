package com.jsp.programming.array;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] <arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("After the Selection Sorting : "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {6,7,1,3,2};
        System.out.println("Before Selection Sort : "+ Arrays.toString(arr));
        selectionSort(arr);
    }
}
