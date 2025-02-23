package com.jsp.programming.array;

public class FirstAndLastAddition {
    public static int addFirstAndLast(int[] arr) {
        int sum = 0;
        int n = arr.length;
        sum = arr[0] + arr[n - 1];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6,9,5};
        System.out.println("Sum of First and Last element of an Array: "+addFirstAndLast(arr));
    }
}
