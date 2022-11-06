package com.InterviewProgram;

public class sumMinMax {
    public static void main(String []args)
    {
        int []arr = {2,5,7,8,1,7,13,15,40};
        int min =arr[0];
        int max =arr.length-1;
        int temp =0, temp2 =0;

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                temp = min;
                min = arr[i];
            }else if(arr[i]>max)
            {
                temp2 = max;
                max =arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println("Sum of Min & Max number is -: " +(min+max));



    }
}
