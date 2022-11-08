package com.Optimisedprogram;

import java.util.Arrays;

public class AddOneInArrayNumber {
/*
    WAP to add one in number presented in Array like below :
    Input - {2,5,4} , {9,9,9}
    Output - {2,5,5} , {1,0,0,0}

    Source Link 1 - https://www.geeksforgeeks.org/adding-one-to-number-represented-as-array-of-digits/

    Scenarios :
      1- positive number
      2- when add 1 in 3 Digits number and it becomes 4 digits number
      3- If array number is -ve value lik 00-1
      4- If array have only -1 digit in array
*/

    public static void addDigitOne(int arr[])
    {
        int [] result = {arr.length+1};
        //StringBuilder str = new StringBuilder();
        int num =Integer.MIN_VALUE;

        for(int i =0 ; i<= arr.length-1;i++)
        {
            num = num*10+ arr[i];
            System.out.println("first for loop "+num);
        }

        num = num+1;
        System.out.println("Add one in num "+num);

        for(int i = result.length-1; i>0;i--)
        {
            result[i]=num%10;
            System.out.println(result[i]);
            num = num/10;
            System.out.println(num);
        }


        for(Integer it : result)
        {
            System.out.println(it);
        }

    }
    public static int[] addOneInArray(int[] arr) {

        int i = arr.length-1;

        while(i >= 0) {

            if(arr[i] != 9) {
                arr[i] = arr[i] + 1;
                return arr;
            }

            arr[i] = 0;
            i--;
        }

        int[] res = new int[arr.length + 1];
        res[0] = 1;
        //?????????
        System.out.println(Arrays.toString(res));
        return res;
    }


    public static void main (String []args)
    {
        System.out.println("Add digit one in array number and store in another array with updated value after adding one.");
        int []arr = {2,5,4};
        int []arr1 = {9,9,9};
        int []arr2 = {0,0,-1};
        int []arr3 = {-1};


       // addOneInArray(arr);
        System.out.println("Result of given Array  -----> "+Arrays.toString(addOneInArray(arr)));
        System.out.println("Result of arr1 -----> "+Arrays.toString(addOneInArray(arr1)));
        System.out.println("Result of arr2  -----> "+Arrays.toString(addOneInArray(arr2)));
        System.out.println("Result of arr3  -----> "+Arrays.toString(addOneInArray(arr3)));

        // addDigitOne(arr);
        //System.out.println("Result of given Array  -----> "+(addDigitOne(arr)));
       // addDigitOne(arr);

    }
}
