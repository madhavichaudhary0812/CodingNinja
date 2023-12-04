package com.Practice2023;

import java.sql.Array;
import java.util.Arrays;

public class AddOneInArray {

    public static void addOne(int arr[])
    {
        int result[] = new int[arr.length +1];
        int num = Integer.MIN_VALUE;

        for(int i=0;i< arr.length; i++)
        {
            num = num*10+arr[i];
        }

        num = num+1;

        for(int j=result.length-1;j>0;j--)
        {
            result[j] =num%10;
            num = num/10;
        }

            System.out.println(Arrays.toString(result));

    }

    public static String addOneInArray(int arr[])
    {
        int i = arr.length-1;

        while (i>=0)
        {
            if(arr[i]!=9)
            {
                arr[i]=arr[i] + 1;
               // System.out.println(Arrays.toString(arr));
                return Arrays.toString(arr);
            }

            arr[i]= 0;
            i--;
        }

        int[] res = new int[arr.length + 1];
        res[0]=1;
       // System.out.println(Arrays.toString(res));
        return Arrays.toString(res);
    }

    public static void main(String args[])
    {
        int arr[] ={2,3,4};
        int arr1[] ={2,3,9};
        int arr2[] ={9,9,9};
        int arr3[] ={0,2,-1};

        System.out.println("Result of given Array  -----> ");
        addOne(arr);
        addOne(arr1);
        addOne(arr3);

        System.out.println("Result of given Array  -----> ");

        System.out.println(addOneInArray(arr));
        System.out.println(addOneInArray(arr1));
        System.out.println(addOneInArray(arr2));
        System.out.println(addOneInArray(arr3));
/*        addOneInArray(arr1);
        addOneInArray(arr2);
        addOneInArray(arr3);*/
    }
}
