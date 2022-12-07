package com.Optimisedprogram;

public class MaxProductSubArray {

    /* Maximum Product Subarray
    * Company - Make My trip
    * Source - https://leetcode.com/problems/maximum-product-subarray/discuss/1608862/JAVA-or-3-Solutions-or-Detailed-Explanation-Using-Image
    * https://leetcode.com/problems/maximum-product-subarray/description/
    * https://leetcode.com/problems/maximum-product-subarray/solutions/183483/JavaC++Python-it-can-be-more-simple/
    * https://www.youtube.com/watch?v=cNLHESv_XPc
    * https://www.scaler.com/topics/maximum-product-subarray/
    * */

    public static long maxProduct(int []arr)
    {
        long max = arr[0];
        long min = arr[0];
        long res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] ==0)
            {
                max = 1;
                min = 1;
                continue;
            }
            long temp1 = arr[i]*max;
            long temp2 = arr[i]*min;

            max = Math.max(temp1,temp2);
            max = Math.max(max,arr[i]);
            min = Math.min(temp1,temp2);
            min = Math.min(min,arr[i]);

            res = Math.max(res,max);

        }

        return res;
    }

    public static int maxProductOnePointer(int[] nums) {

        if (nums == null || nums.length == 0)
        {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int resp = nums[0];

        for(int i=1; i<nums.length;i++)
        {
            int temp = max;

            max = Math.max(Math.max(max * nums[i], min * nums[i]),nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]),nums[i]);

            if (max > resp) {
                resp = max;
            }

        }

        return resp;

    }

    public static void main(String[] args) {
        int arr[] = {-3,-1,-10,0,60};
        int brr[] = {2,3,-2,4};
        System.out.println(maxProduct(arr));
        System.out.println(maxProduct(brr));
        System.out.println(maxProductOnePointer(arr));
    }
}
