package com.jsp.programming.array;

import java.util.Arrays;

public class LinearSearch {
    public static int  search(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(key == arr[i]) {
                System.out.println("Element is found at index : "+i+ " And the Value is: "+arr[i]);
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8,6,1,5};
        System.out.println("Original Array"+ Arrays.toString(arr));
        int notFound = search(arr,1);
        System.out.println(notFound);
    }
}
