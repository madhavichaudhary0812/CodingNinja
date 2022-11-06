package com.InterviewProgram;

public class quickSort {

    public static void quickSort(int[]input, int sI, int eI)
    {
        if(sI >= eI)
        {
            return ;
        }

        int pivotPos = partition(input,sI, eI);
        quickSort(input,sI,pivotPos-1);
        quickSort(input,pivotPos+1, eI);


    }

    public static int partition(int [] input, int sI, int eI)
    {
        int pivot=input[sI];
        int count =0;
        for(int i=sI+1; i<=eI;i++)
        {
            if (input[i] <= pivot)
                count++;
        }
            int pivotPos = sI + count;
            int temp = input[sI];
            input[sI] = input[pivotPos];
            input[pivotPos] = temp;

            int i = sI;
            int j = eI;

            while (i < pivotPos && j > pivotPos)
            {
                if(input[i]<= input[pivotPos])
                {
                    i++;
                }else if(input[j] > input[pivotPos])
                {
                    j--;
                }else
                {
                    int temp2 = input[i];
                    input[i] = input[j];
                    input[j] = temp2;
                    i++;
                    j--;
                }
            }

        return pivotPos;

    }

    public static void main(String []args)
    {
        int [] input = {4,5,9,12,19,2,8,13};
        int sI = 0;
        int eI = input.length-1;
        quickSort(input, sI, eI);
        for(int i=0; i<input.length;i++)
        {
            System.out.print(input[i] + " ");
        }
    }
}
