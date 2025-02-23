package com.jsp.programming.array;

public class SecondLargestElement {
    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("The Second largest value of the given array is : "+secondMax);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,10,3};
        findSecondMax(arr);
    }
}
