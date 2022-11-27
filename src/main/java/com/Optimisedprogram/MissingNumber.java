package com.Optimisedprogram;

public class MissingNumber {

    public static void missingNumber(int[] brr)
    {
        int n = brr.length;
        int sum_Total = ((n+1)*(n+2))/2;
        int sum_actual =0 ;
        int missingNum ;
        System.out.println(n);
        System.out.println(sum_Total);
        for(int i = 0; i < n; i++) {
            sum_actual += brr[i];
        }

        System.out.println(sum_actual);

        missingNum =  sum_Total- sum_actual;

        System.out.println("Missing number for given array is --> "+missingNum);

    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        missingNumber(arr);
    }
}
