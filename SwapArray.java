package com.jsp.programming.array;

import java.util.Arrays;

public class SwapArray {
    public static void swapFirstAndLast(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        System.out.println("Array after Swaping: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,7,8};
        System.out.println("Before Swaping "+ Arrays.toString(arr));
        swapFirstAndLast(arr);
    }
}
