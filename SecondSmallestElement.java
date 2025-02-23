package com.jsp.programming.array;

public class SecondSmallestElement {
    public static void findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("The Second largest value of the given array is : "+secondMin);
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,10,3};
        findSecondMin(arr);
    }
}
