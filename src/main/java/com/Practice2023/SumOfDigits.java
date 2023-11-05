package com.Practice2023;

public class SumOfDigits {

    public static int sumOfDigits(int num)
    {
        int rem =0;

        while(num !=0 || rem>9)
        {
            if(num==0)
            {
                num = rem;
                rem =0;
            }
            rem = rem + num%10;
            num = num/10;
        }
        return rem;
    }

    public static void main (String args[])
    {
        int num = 345621;
        System.out.print(sumOfDigits(num));
    }

}
