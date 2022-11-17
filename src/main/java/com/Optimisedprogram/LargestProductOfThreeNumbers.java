package com.Optimisedprogram;

public class LargestProductOfThreeNumbers {

    /* Company - Yubi - first Round
    *WAP to get largest product of 3 numbers from given array
    *
    * approaches - 3 (bruteforce, sort the array, scan the number
    * Source - https://afteracademy.com/blog/maximum-product-of-three-numbers
    * */
   public static int largestProduct(int nums[])
   {
       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;
       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       int max3 = Integer.MIN_VALUE;

       for (int i = 0; i < nums.length; i++) {
           if(nums[i]<=min1)
           {
               min2=min1;
               min1=nums[i];
           }else if(nums[i]<=min2)
           {
               min2=nums[i];
           }

           if(nums[i]>max1)
           {
               max2=max1;
               max3=max2;
               max1=nums[i];
           }else if(nums[i]>max2)
           {
               max3=max2;
               max2=nums[i];
           }else if(nums[i]>max3)
           {
               max3=nums[i];
           }

       }
       return Math.max((min1*min2*max2),(max1*max2*max3));

   }

    public static void main(String[] args) {
        int arr[] = {-3,0, 4, 2,1, -2, -1};
        int arr1[] = {3,0, 5, 2,1, 6, -1};

        System.out.println("Largest product of this Array is -> "+largestProduct(arr));
        System.out.println("Largest product of this Array is -> "+largestProduct(arr1));
    }
}
