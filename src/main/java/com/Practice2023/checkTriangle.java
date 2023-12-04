package com.Practice2023;

public class checkTriangle {

/*    Company - Zupee
Problem - Write a query identifying the type of each record in the TRIANGLES table using its three side lengths.
Output one of the following statements for each record in the table:

    Equilateral: It's a triangle with 3 sides of equal length.
    Isosceles: It's a triangle with 2 sides of equal length.
    Scalene: It's a triangle with sides of differing lengths.
    Not A Triangle: The given values of A, B, and C don't form a triangle.*/

    public static void checkTriangle(int x,int y, int z)
    {
        if(x+y <=z || y+z <=x || z+x<=y)
        {
            System.out.println("Triangle can't form with given values");
            return;
        }

        if(x==y && y==z && z==x)
        {
            System.out.println("Triangle is Equilateral");
        }else if (x==y || y==z || z==x)
        {
            System.out.println("Triangle is Isosceles");
        }else
        {
            System.out.println("Triangle is Scalene");
        }

    }

    public static void main(String[] args) {
        int x=9;
        int y=9;
        int z=8;
        checkTriangle(x,y,z);

    }
}
