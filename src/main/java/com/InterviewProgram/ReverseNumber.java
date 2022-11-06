package com.InterviewProgram;

public class ReverseNumber {
//Source Link https://leetcode.com/problems/reverse-integer/submissions/
    public static int reverseNumber (int N)
    {
        int rem=0;
        long rev=0;
        while(N!=0){
            rem=N%10;
            N=N/10;
            rev=rev*10+rem;

        }

        if (rev > Math.pow(2, 31)-1 || rev < -(Math.pow(2, 31))) {
            return 0;
        }
        int check=(int)rev;

        return check;

    }

    public static void main (String []args)
    {
        int N2 = 543216;
        int N1 = 00123;
        int N3 = -23123;
                //000123;
        //reverseNumber(N);
        System.out.println(reverseNumber(N1));
        System.out.println(reverseNumber(N2));
        System.out.println(reverseNumber(N3));
    }
}
