package com.Optimisedprogram;

public class LargestPrimeFactor {

    public static int largestPF(int n)
    {
        int div = 2;
        if(n<=1) {
            return 0;
        }
        else
        {
            while(div < n)
            {
                if(n % div !=0)
                {
                    div++;
                }else
                {
                    n = n/div;
                    div =2;
                }
            }
        }

       return n;
    }

    public static long largestPrimeFactor(long n)
    {
        long max_prime = -1;

        while(n%2 ==0)
        {
            max_prime =2;

            n>>=1;
        }

       for(int i =3; i< Math.sqrt(n); i+=2)
       {
           if(n % i ==0)
           {
               max_prime =i;
               n = n/i;
           }
       }

       if(n >2)
       {
           max_prime = n;
       }
        return max_prime;
    }

    public static void main(String[] args) {
        int n = 66;
        long h = 670;
        System.out.println(largestPF(n));
        System.out.println(largestPrimeFactor(h));
    }
}
