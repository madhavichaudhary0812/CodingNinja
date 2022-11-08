package com.Optimisedprogram;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeWRTAge {

    /*  WAP to sort Employee on basis of age and store in list :
                Employee<Name , Age>
                Input - {Vikash, 20}, {Mahesh, 12},{Ram, 10},{Mohan, 17}
                Output - {Vivaks, Mohan, Mahesh, Ram}

                Source Link 1 - https://www.javatpoint.com/difference-between-comparable-and-comparator
                Source link 2 - https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
     */

    public static void main (String Args[])
    {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Vikas", 12));
        emp.add(new Employee("Mohan", 20));
        emp.add(new Employee("Rohan", 13));
        emp.add(new Employee("Deepak", 10));
        emp.add(new Employee("Madhavi", 17));
        emp.add(new Employee("Ram", 15));

        Collections.sort(emp);

        for(Employee el : emp)
        {
           // System.out.println(el.Name + " Age is "+ el.Age);
           // System.out.println("Employee sorted on basis of age : "+el.Name);
            System.out.println(el.Name);

        }
    }
}

