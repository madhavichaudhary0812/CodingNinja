package com.InterviewProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class longestSubsequenceInt {

    public static void findLongestConseqSubseq(int[] arr, int n) {
        Arrays.sort(arr);

        int count = 0, ans = 0;

        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i -1]) {
                al.add(arr[i]);
            }

        }
        System.out.print("Arraylist elements : " +al);
        System.out.println(" " );
        for (int i = 0; i < al.size(); i++) {

            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && al.get(i) == al.get(i - 1) + 1) {
                count++;

            }
            else {
                count = 1;
            }
            // Update the maximum
            ans = Math.max(ans, count);
        }
        System.out.println("size of subsequence : "+ans);
        System.out.print("Longest SubSequence elements are : { ");
        for(int i=0; i<ans ; i++)
        {

            System.out.print(al.get(i) + " ");
        }
        System.out.print("}");

    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        findLongestConseqSubseq(arr, n);

    }
}
