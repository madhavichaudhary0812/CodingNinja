package com.InterviewProgram;

public class Fibonacci {
// solution 1 in recurssive way
    public static int fib(int n){

        System.out.println("fib " + n);

        if(n==0 || n==1)
        {
            return n;
        }

        return fib(n-1) + fib(n-2);

    }

//Solution 2 - normal way
    public static void fibonacciSeries(int n)
    {
        int n1=0, n2=1, n3, count =n;
        System.out.print(n1 +" " +n2);
        for(int i=2; i<count ; i++)
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 =n2;
            n2 = n3;
        }

    }

    //Solution 3 - Iterative Way
    public static void fibonacciSeries2(int n)
    {
        int n1=0, n2=1, n3=0, count =0;

        while(count<n)
        {
            System.out.print(n1 + " ");
            n3 = n1+n2;
            n1 =n2;
            n2 = n3;
            count++;
        }
    }
    public static void main(String[] args) {

        int n = 7;
        System.out.println("Fibonacci series by recurssion -----");
        System.out.println(fib(n));

        System.out.println("**********************************************************************");
        System.out.println("Fibonacci series without using recurssion -----");
        fibonacciSeries(n);

        System.out.println("");
        System.out.println("**********************************************************************");
        System.out.println("Fibonacci series with using iterative -----");
        fibonacciSeries2(n);

    }
}
