package com.jsp.programming.array;

import java.util.Arrays;

public class CopyArray {
    public static void copy(int[] arr) {
        int[] copyArr = new int[arr.length];
        //Copying
        for(int i=1; i<arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.println("Second Array : "+Arrays.toString(copyArr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        System.out.println("First Array : "+Arrays.toString(arr));
        copy(arr);
    }
}
