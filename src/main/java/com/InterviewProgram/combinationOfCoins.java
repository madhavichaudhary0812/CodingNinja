package com.InterviewProgram;
import java.util.*;

public class combinationOfCoins {
    //Wap to give count of all possible combination of coins in array which sum will be equal to given targeted sum or count;

   //Wap to print all possible combination of coins in array which sum will be equal to given targeted sum or count;

   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       if (candidates == null || target == 0) {
           return ans;
       }

       backtrack(ans, new ArrayList<>(), candidates, target);
       return ans;
   }

    public static void backtrack(List<List<Integer>> res, List<Integer> list, int[] candidates, int remain) {
        if (remain < 0) {
            return;
        }

        if (remain == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        int len = candidates.length;
        for (int i = 0; i < len; i++) {
            int num = candidates[i];
            list.add(num);
            backtrack(res, list, candidates, remain - num);
            list.remove(list.size() - 1);
        }

    }
    public static void main(String args[])
    {
        int arr[] = {1,2,5};
        int count = 5;

        List<List<Integer>> newlist = combinationSum(arr,count);
        System.out.println(newlist);
        System.out.println("Total count of combination is - " + newlist.size());
    }
}
