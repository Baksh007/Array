package com.jsp.programming.array;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("After Bubble sort we got : "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {6,7,1,3,2};
        System.out.println("Before Bubble Sort : "+Arrays.toString(arr));
        sort(arr);
    }
}
