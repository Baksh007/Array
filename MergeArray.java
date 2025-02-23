package com.jsp.programming.array;

import java.util.Arrays;

public class MergeArray {
    public static void merge(int[] arr1, int[] arr2) {
        int k = 0;
        int[] mergeArr = new int[arr1.length + arr2.length];

        for(int i=0; i<mergeArr.length; i++) {
            if(i < arr1.length) {
                mergeArr[i] = arr1[i];
            }
            else {
                mergeArr[i] = arr2[k++];
            }
        }
        System.out.println("After Merging the Array : "+Arrays.toString(mergeArr));
    }
    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7};
        int[] arr2 = {8,9,10};

        merge(arr1, arr2);
    }
}
