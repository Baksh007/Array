package com.jsp.programming.array;

import java.util.Arrays;

public class LeftRotate {
    public static void rotate(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,6};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
    }
}
