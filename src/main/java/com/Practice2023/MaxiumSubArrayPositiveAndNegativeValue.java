package com.Practice2023;

public class MaxiumSubArrayPositiveAndNegativeValue {

/*    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    Solution - https://shethradhika9.medium.com/maximum-subarray-ddfd3311d78c
    leet code - https://leetcode.com/problems/maximum-subarray/
    */
public static int maxSubArray(int[] nums) {

    int currentMax =nums[0];
    int max = nums[0];

    for(int i=1;i<nums.length;i++)
    {
        currentMax = Math.max(nums[i],currentMax+nums[i]);
        if(currentMax>max)
        {
            max = currentMax;

        }
    }

    return max;
}

    public static void main(String[] args) {
        int input[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input));
    }

}
