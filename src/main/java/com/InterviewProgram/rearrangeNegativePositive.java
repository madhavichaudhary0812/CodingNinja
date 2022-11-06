package com.InterviewProgram;

public class rearrangeNegativePositive {

    public static void printShiftNegative(int []array)
    {
        if(array.length ==0)
        {
            return;
        }

       int j=0, temp;
        for(int i=0; i< array.length; i++)
        {
            if(array[i] < 0)
            {
                if(i !=j)
                {
                    temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }


    }
    public static void printArray(int []array)
    {
        for(int i=0; i< array.length ;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String []args)
    {
        int arr[] ={ 2,4,-10,13,-7,-60,52,8,-19 };
                //{2,-11,4,5,-3,10,-12,-1,0,-1,0,1};
        printShiftNegative(arr);
        printArray(arr);
    }
}
