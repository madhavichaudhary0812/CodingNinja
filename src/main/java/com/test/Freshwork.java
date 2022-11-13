package com.test;

public class Freshwork {

    /*
    * Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
    *
    *
    * */

    public static int maxWealth(int [][] accounts)
    {
        int ans=0;

        for(int i=0;i< accounts.length ; i++)
        {
            for (int j = 1; j < accounts[i].length; j++)
            {
                accounts[i][j] = accounts[i][j] +accounts[i][j-1];
            }

            ans = Math.max(ans,accounts[i][accounts[i].length-1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] accounts = {{2,4}, {10,11,15}};
        System.out.println(maxWealth(accounts));
    }
}
