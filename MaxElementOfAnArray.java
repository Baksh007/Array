package com.jsp.programming.array;

public class MaxElementOfAnArray {
    public static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max value of the given array is : "+max);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,10,3};
        findMax(arr);
    }
}
