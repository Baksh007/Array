package com.jsp.programming.array;

import java.util.Arrays;

public class SortArray {
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting : "+ Arrays.toString(arr));
    }
    public static void main(String[]args) {
        int[] arr = {6,3,5,1,2,4,7};
        System.out.println("Array before sorting : "+Arrays.toString(arr));
        sort(arr);
    }
}
