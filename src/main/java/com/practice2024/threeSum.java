package com.practice2024;

import java.util.*;

public class threeSum {

    public static List<List<Integer>> threeSumSolution(int nums[], int target){

        if(nums.length < 3 && nums == null){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> newList = new HashSet<>();

        for (int i = 0; i < nums.length-2 ; i++) {

            int left = i+1;
            int right = nums.length-1;

            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum ==0)
                {
                    newList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
            
        }

        return new ArrayList<>(newList);

    }


    public static void main(String[] args) {
        int[] nums ={-1,1,0,-1,2,};
        int target = 0;

        System.out.println(threeSumSolution(nums,target));
    }
}
