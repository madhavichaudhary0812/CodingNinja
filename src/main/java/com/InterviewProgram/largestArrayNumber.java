package com.InterviewProgram;

public class largestArrayNumber {
    public static int findlargestNo(int []Arr)
    {
       int temp =0;

       for(int i=0; i< Arr.length-1; i++)
       {
           if(Arr[i] < Arr[i+1])
           {
               temp = Arr[i+1];
           }

       }

        return temp;
    }
    public static void main(String []args)
    {
        int []Arr = {2,5,8,-1,6,10,16,17,2,6,20};
        System.out.print(findlargestNo(Arr));
    }
}
