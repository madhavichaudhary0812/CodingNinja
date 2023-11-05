package com.Optimisedprogram;

public class SumNumber {

    /* WAP to Finding sum of digits of a number until sum becomes single digit
    *  Input : 1234
    *  Output : 1
    * Input : 5674
    * Output : 4
    * */

    public static void sum(int num) {
        int rem = 0;
        while (num != 0 || rem > 9) {
            if (num == 0) {
                num = rem;
                rem = 0;

            }
            rem = rem + num % 10;
            num = num/10;

        }

        System.out.println(rem);
    }


    public static void main(String[] args) {
        int num = 345621;
                //1235;
        sum(num);


    }
}
