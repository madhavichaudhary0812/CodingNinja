package com.Practice2023;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++)
        {
            int rem = target-nums[i];
            if(map.containsKey(rem))
            {
                return new int[]{i, map.get(rem)};

            }
            map.put(nums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        // Test the algorithm with example inputs
        int[] result1 = solution.twoSum(new int[]{2, 15, 11, 7}, 9);
        // Output the results
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 3]

        int[] result2 = solution.twoSum(new int[]{3, 1, 4, 8, 5}, 9);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [2, 4]

        int[] result3 = solution.twoSum(new int[]{10, 20, 30, 40, 50}, 90);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [3, 4]
    }
}
