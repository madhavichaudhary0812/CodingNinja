package com.test;

public class test6 {

    public static int maxproduct(int nums[]) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int resp = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > resp) {
                resp = max;
            }

        }


        return resp;
    }

    public static void main(String[] args) {

        int arr[] = {2, -1, 0, 9, 1, -9, -8, -2, 0, 23, -1, 9};
        System.out.println(maxproduct(arr));
    }
}
