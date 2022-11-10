package com.Optimisedprogram;

import java.nio.channels.ScatteringByteChannel;

public class ArrayLengthWithoutInbuiltFunction {

    /* Zee Entrainment - 2nd Round
    * WAP to get length of array without using inbuilt method
    *
    * Source for way 1 - https://stackoverflow.com/questions/11236848/can-i-find-out-the-length-of-an-array-without-using-length-in-java
    *
    * 1- Way - Use count variable with advance for loop
    * 2- Way - Use count with normal for loop without middle condition and write code in try catch block
    * 3- Way -
    * */

    public static int lengthOFArray(int []arr)
    {
        int count = 0;
        for(int i : arr)
        {
            count++;
        }

        return count;
    }
    public static int arrayLength(int []arr)
    {
        int count =0;
        try
        {
        for (int i = 0;; i++) {
            count++;

        } }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(lengthOFArray(arr));
        System.out.println(arrayLength(arr));
    }
}
