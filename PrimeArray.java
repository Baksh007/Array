package com.jsp.programming.array;

import java.util.Arrays;

public class PrimeArray {
    public static boolean findPrime(int n) {

        int count = 0;
        for(int i=0; i<n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;

        System.out.println("Prime number in this arr is "+findPrime(n));


    }
}
