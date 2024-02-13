package com.array;

public class RemoveElement {

    //https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

    public static int removeElement(int[] nums, int val) {

        if(nums.length<=0)
        {
            return 0;
        }

       int  i=0;

        for ( int num : nums)
            if (num != val) {
                nums[i++] = num;//2,
            }

       return i;
    }

    public static void printArray(int intArray[], int index)
    {
        if(index ==0)
        {
            System.out.println("given array doesn't have that element given for remove");
            return;
        }

        if(intArray.length<=0)
        {
            System.out.println("given array doesn't have any elements");
            return;
        }

        Object array[]= new Object[intArray.length];
        for (int i = 0; i < intArray.length ; i++) {

            if(i>=index)
            {
                array[i]='_';
            }else
            {
                array[i]=intArray[i];
            }

            System.out.print(array[i]+" ");


        }
    }


    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int nums1[] = {1,2,2,4};
        int nums2[] ={};
        int m=3;
        System.out.print("{ ");
        printArray(nums,removeElement(nums, m));
        System.out.print("}");
        System.out.println("");
        printArray(nums,removeElement(nums1, m));
        System.out.println("");
        printArray(nums,removeElement(nums2, m));

    }
}
