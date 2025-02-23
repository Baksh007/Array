package com.jsp.programming.array;

public class SLEFAAUL {
    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int j=0; j<arr.length; j++) {
            if(arr[j] > secondMax && arr[j] != max ) {
                secondMax = arr[j];
            }
        }
        System.out.println("The Second largest value of the given array is : "+secondMax);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,10,3};
        findSecondMax(arr);
    }
}
