package com.InterviewProgram;

public class ReverseNumber {
//Source Link https://leetcode.com/problems/reverse-integer/submissions/

    /*
    * 234 - 432
    * 0245 - 5420
    * 300- 003 & 3
    *
    * String s1 = "300"
    * s2 - 003
    * s2.replace("0")
    * int x = int.parseInt(s2);
    * 00123 - Java consider this input as octal value to operate on this first it will convert into decimal value
    * of "00123" th
    *
    *
    *
    *
    * */
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
    public static void test(int n)
    {
//        String s2 = n+"";
//        String s3 = String.valueOf(n); //generally use this
        StringBuilder s4 = new StringBuilder();
        s4.append(n);
        s4 = s4.reverse();

        int m = Integer.parseInt(s4.toString());
        System.out.println(m);

    }

    public static void main (String []args)
    {
        int N2 = 543216;
        int N1 = 1203;
        int N4 = 12300;
        int N3 = -23123;
                //000123;
        //reverseNumber(N);
//        System.out.println(reverseNumber(N1));
//        System.out.println(reverseNumber(N2));
//        System.out.println(reverseNumber(N3));
        test(N1);
        test(N4);
    }
}
