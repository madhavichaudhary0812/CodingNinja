package com.Practice2023;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArrayByIndex(int arr[], int n)
    {
        int temp[]=new int[n];
//copy the position to temp
        for (int i = 0; i < n; i++) {
            temp[i]=arr[i];
        }
//shift the remaining element form array to left side
        for (int i = n; i < arr.length-1 ; i++) {
            arr[i-n]=arr[i];
        }
//copy the element from temp array to actual array
        for (int i = 0; i < n; i++) {
            arr[arr.length-n+i]=temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,7,9,8,3};
        int n =2;

        System.out.println(Arrays.toString(rotateArrayByIndex(arr,n)));
    }
}
