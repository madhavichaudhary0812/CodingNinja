package com.InterviewProgram;

public class palindromeNumber {

    public static boolean isPalindrome(int str)
    {

        int num,sum=0,temp;
        temp=str;

        while(str>0)
        {
            num = str%10; //454 - 4 , 5, 4
            sum = (sum*10) + num; // - 0+4 , 45, 454
            str = str/10; //45, 4,
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
        int str =  454;
        boolean status = isPalindrome(str);
        System.out.println("Given Number is Palindrome :- " +status);
    }
}
