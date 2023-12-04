package com.Practice2023;

public class Fibonacci {

    //recurssive way
    public static int FibonacciByRecurssion(int n)
    {
        System.out.print(" "+n+" ");
        if(n==0 || n==1)
        {
            return n;
        }

       return (FibonacciByRecurssion(n-1) + FibonacciByRecurssion(n-2));
    }

    //normal way
    public static void FibonacciByNormal(int n)
    {
      int n1=0;
      int n2 =1;
      int count =n;
      int n3;

        System.out.print(n1 +" "+n2);
        for (int i = 0; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
    //iterative way

    public static void FibonacciByIterativeWay(int n)
    {
        int n1=0, n2=1, n3=0, count=0;

        while (count<n)
        {
            System.out.print(n1+" ");
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
    }

    public static void main(String[] args) {
        int n =9;

        System.out.println("Fibonacci series by recurssion -----");
        System.out.print(FibonacciByRecurssion(n));

        System.out.println("**********************************************************************");
        System.out.println("Fibonacci series without using recurssion -----");
        FibonacciByNormal(n);

        System.out.println("");
        System.out.println("**********************************************************************");
        System.out.println("Fibonacci series with using iterative -----");
        FibonacciByIterativeWay(n);

    }
}
