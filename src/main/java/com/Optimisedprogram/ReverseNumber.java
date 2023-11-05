package com.Optimisedprogram;

public class ReverseNumber {

    /*WAP to reverse the number and handle edge scenarios

    * */
    public static int reverseNumber(int num)
    {
        int reverseNum = 0;
        int reminder = 0;
        while(num!=0)
        {
            reminder = num%10;
            reverseNum = reverseNum*10 + reminder;
            num = num/10;
        }
        if(reverseNum > Math.pow(2,31)-1 && reverseNum < - Math.pow(2,31))
        {
            return 0;
        }
        int check=(int)reverseNum;

        return check;
    }

    public static int reverseSpecialNumber(int n)
    {
        StringBuilder s1 = new StringBuilder();
        s1.append(n);
        s1 = s1.reverse();
        int m = Integer.parseInt(s1.toString());

        return m;
    }

    public static void main(String[] args) {
        int n = 1234;
        int n1 = 40100;
        int n2 = 00123;//to handle this case use string builder
        int n3 = -4454234;
        System.out.println("Reverse number for this "+n +" is = "+reverseNumber(n));
        System.out.println("Reverse number for this "+n1 +" is = "+reverseSpecialNumber(n1));
        System.out.println("Reverse number for this "+n2 +" is = "+reverseSpecialNumber(n2));
        System.out.println("Reverse number for this "+n3 +" is = "+reverseNumber(n3));
    }
}
