package com.Practice2023;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) { // if any two elements are the same, return true
                    return true;
                }
            }
        }
        return false; // if no duplicates are found, return false
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {};
        int[] nums4 = {1, 1, 1, 1};

        System.out.println(containsDuplicate(nums1)); // Expected output: false

        System.out.println(containsDuplicate(nums2)); // Expected output: true

        System.out.println(containsDuplicate(nums3)); // Expected output: false

        System.out.println(containsDuplicate(nums4)); // Expected output: true
    }
}
