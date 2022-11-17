package com.test;

public class Test2 {

/* Largest multiple of three numbers
[3,8,1,5,0,4,2,6]
* */

    public static int maximumMultiple(int[] nums)
    {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=min1)
            {
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]<= min2)
            {
                min2 = nums[i];
            }
            if(nums[i]>=max1)
            {
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>=max2)
            {
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>=max3)
            {
                max3=nums[i];
            }
        }

        System.out.println(min1+" ," +min2);
       // System.out.println(max1+" ," +max2);
        System.out.println(min1*min2*max1);
       System.out.println(max1*max2*max3);
       return Math.max((min1*min2*max1),(max1*max2*max3));
        //return (max1*max2*max3);
    }
    public static void main(String[] args) {
        int arr[] = {-3,-4,0,1,1,2};   //{3,8,1,5,0,4,2,6};
        System.out.println(maximumMultiple(arr));


    }
}
