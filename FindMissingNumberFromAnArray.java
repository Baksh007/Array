package com.jsp.programming.array;

public class FindMissingNumberFromAnArray {
    public static void missNumber(int[] arr) {
        int n = arr.length+1;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int a : arr) {
            sum += a;
        }
        int missingNumber = total - sum;
        System.out.println("Missing Number is: "+missingNumber);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9,10};
        missNumber(arr);
    }
}
