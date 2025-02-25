package com.jsp.programming.array;

import java.util.Arrays;

public class MissingNumber {
    public static void missingElement(int[] arr) {
        int n = arr.length;
        int totalSum = n*(n+1)/2;
        int arrSum = 0;
        for(int i=0; i<n; i++) {
            arrSum += arr[i];
        }
        System.out.println("Sum of the array: "+arrSum);
        int missingNum = arrSum-totalSum;
        System.out.println("The Missing number is: "+missingNum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        missingElement(arr);
    }
}
