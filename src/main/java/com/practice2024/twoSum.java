package com.practice2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] twoSumSolution(int[] nums, int target)
    {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target-nums[i]))
            {
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }

            map.put(nums[i],i);
        }

        return result;

    }


    public static int[] twoSum2ndSolution(int[] nums, int target)
    {
        int[] result = new int[2];
        Arrays.sort(nums);
        int n = nums.length-1;

        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i] + nums[n-1] < target)
           {
               n--;
           }else if(nums[i] + nums[n-1] > target)
           {
               i++;
           }else
           {
               result[1]= n;
               result[0]= i;
           }

        }

        return result;

    }


    public static void main(String[] args) {
        int[] nums ={1,3,3,4};
        int[] nums2 ={-1,1,0,-3,3,4,5,6};
        int target = 5;
        int target2 = 3;

        Arrays.stream(twoSumSolution(nums, target)).forEach(System.out::println);
        Arrays.stream(twoSum2ndSolution(nums2, target2)).forEach(System.out::println);
    }
}
