package com.Optimisedprogram;

public class CheckNumberPalindrom {

    /* WAP to check given number is Palindrome
    *
    * */

    public static boolean checkPalindromeNumber(int num)
    {
      int rev = 0;
      int rem =0;
      int temp = num;
      while (num>0)
      {
          rem = num%10;
          rev = rev*10+rem;
          num = num/10;
      }
      if(rev > Math.pow(2,31)-1 && rev <-Math.pow(2,31))
      {
          return false;
      }

      if(rev==temp)
      {
          return true;
      }
       return false;
    }

    public static void main(String[] args) {
        int n = 2413142;
        int n1 = 241314;
        System.out.println(checkPalindromeNumber(n));
        System.out.println(checkPalindromeNumber(n1));
    }
}
