package com.jsp.programming.array;

import java.util.Arrays;

public class ConvertingArray {
    public static int[] makeEnds(int[] arr) {
        int[] arr2 = new int[2];
        arr2[0] = arr[0];
        arr2[1] = arr[arr.length-1];
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,9,1};
        int[] arr2 = makeEnds(arr);

        System.out.println("Before Converting the Array: "+ Arrays.toString(arr));
        System.out.println("After Converting the Array: "+Arrays.toString(arr2));
    }
}