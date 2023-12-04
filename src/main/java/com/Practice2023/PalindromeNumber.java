package com.Practice2023;

public class PalindromeNumber {

    public static boolean palindromeCheck(int n)
    {
        int rem =0;
        int tem =0;
        int num = n;

        while(n>0)
        {
            rem = n%10;
            tem = tem*10 + rem;
            n = n/10;
        }

        if(num==tem)
        {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        int n = 1234321;
        System.out.println("Given Number is palindrome -> "+palindromeCheck(n));

    }
}
