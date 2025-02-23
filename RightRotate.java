package com.jsp.programming.array;

import java.util.Arrays;

public class RightRotate {

    public static void rotateArray(int[] arr) {
        for(int i=arr.length -1; i>=0; i--) {
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        System.out.println(Arrays.toString(arr));
        rotateArray(arr);
    }
}
