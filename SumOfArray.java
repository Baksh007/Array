package com.jsp.programming.array;

public class SumOfArray {
    public static int printSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int printEvenSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int printOddSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,8,7};
        System.out.println("Sum of the Array : "+printSum(arr));
        System.out.println("Sum of the Even Array: "+printEvenSum(arr));
        System.out.println("Sum of the Odd array : "+printOddSum(arr));
    }
}
