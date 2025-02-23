package com.jsp.programming.array;

public class MinElementOfAnArray {
    public static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The min value of the given array is : "+min);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,10,3};
        findMin(arr);
    }
}
