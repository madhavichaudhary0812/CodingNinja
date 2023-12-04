package com.Practice2023;

public class secondLargestNumber {

    public static void secondLargestNumberInArray(int arr[])
    {
        if(arr.length<1)
        {
            System.out.println("Array doesn't have element");
            return;
        }

        if(arr.length==1)
        {
            System.out.println("Array have one element");
            return;
        }

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++) {
            if(arr[i]>largestNumber)
            {
                secondLargestNumber = largestNumber;
                largestNumber =arr[i];

            }else if(arr[i]>secondLargestNumber && arr[i]!= largestNumber)
            {
                secondLargestNumber =arr[i];
            }
        }

        if(secondLargestNumber == Integer.MIN_VALUE)
        {
           System.out.println("there is no second largest number");
           return;
        }
        System.out.println(largestNumber);
        System.out.println(secondLargestNumber);
    }

    public static void main (String args[])
    {
        int arr[]={2,5,6,7,9,3,11};
        int arr1[]={};
        int arr2[]={2,2,2,2,2};
        int arr3[]={2};
        secondLargestNumberInArray(arr);
        secondLargestNumberInArray(arr1);
        secondLargestNumberInArray(arr2);
        secondLargestNumberInArray(arr3);
    }
}
