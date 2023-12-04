package com.Practice2023;

public class largestNumberArray {

    public static void largestNumber(int arr[])
    {
        int largestNumber = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++) {
            if(arr[i]>largestNumber)
            {
                largestNumber =arr[i];
            }

        }

        System.out.println(largestNumber);
    }

    public static void main (String args[])
    {
        int arr[]={2,5,6,7,9,3,11};
        largestNumber(arr);
    }
}
