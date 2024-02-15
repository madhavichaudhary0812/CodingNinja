package com.practice2024;

public class DigitSumEqualToTarget {

    //EPAM interview Question

    public static void digitSumEqualToTarget(int startNum, int endNum, int target)
    {
        for (int i = startNum; i <= endNum ; i++) {
            if(SumEqualToTarget(i)==target)
            {
                System.out.print(i+ " ");
            }
        }
    }

    public static int SumEqualToTarget(int digit)
    {
        int number =0, sum=0;
        while(digit>0)
        {
            number = digit%10;
            sum = sum + number;
            digit = digit/10;
        }
        return sum;
    }

    public static void main(String[] args) {
       int startNum = 10;
       int endNum =99;
       int target = 10;

       digitSumEqualToTarget(startNum, endNum, target);
    }
}
