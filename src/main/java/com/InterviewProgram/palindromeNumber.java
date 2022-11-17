package com.InterviewProgram;

public class palindromeNumber {

    public static boolean isPalindrome(int n)
    {

        int num,sum=0,temp;
        temp=n;

        while(n>0)
        {
            num = n%10; //454 - 4 , 5, 4
            sum = (sum*10) + num; // - 0+4 , 45, 454
            n = n/10; //45, 4,
        }

        if(temp==sum)
        {
            return true;
        }else
        {
            return false;
        }
    }


    public static void main(String []args)
    {
        int num =  454;
        boolean status = isPalindrome(num);
        System.out.println("Given Number is Palindrome :- " +status);
    }
}
