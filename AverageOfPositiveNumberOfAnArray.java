package com.jsp.programming.array;

public class AverageOfPositiveNumberOfAnArray {
    public static void findAverage(int[] arr) {
        int count = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        double avg = sum/count;
        System.out.println("Average sum of the given array is : "+avg);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,-1,7};
        findAverage(arr);
    }
}
