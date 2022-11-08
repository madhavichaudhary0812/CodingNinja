package com.Optimisedprogram;

public class Employee implements Comparable<Employee> {

    String Name ;
    int Age;

    Employee(String Name, int Age)
    {
        this.Name = Name;
        this.Age = Age;

    }

    @Override
    public int compareTo(Employee el) {

        if(Age == el.Age)
        {
            return 0;
        }else if(Age > el.Age)
        {
            return 1;
        }else
        {
            return -1;
        }

    }
}
