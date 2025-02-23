package com.jsp.programming.array;

public class FactorsOfGivenArray {
    public static void findFactors(int[] arr) {
        int k = 14;

        for(int i=0; i<arr.length; i++) {
            if(k % arr[i] == 0 && arr[i] != k) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        findFactors(arr);
    }
}
