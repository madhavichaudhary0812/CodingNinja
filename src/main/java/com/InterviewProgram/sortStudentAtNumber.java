package com.InterviewProgram;

import java.util.ArrayList;
import java.util.Collections;

public class sortStudentAtNumber {

    public static void main(String []args)
    {
        ArrayList<Student> std = new ArrayList<Student>();
        std.add(new Student("Vijay", 2, 56));
        std.add(new Student("Raghav", 5, 65));
        std.add(new Student("Mohan", 1, 45));
        std.add(new Student("Nandu", 6, 78));
        std.add(new Student("Tilak", 7, 89));
        std.add(new Student("Maddy", 4, 90));
        std.add(new Student("Vikas", 3, 37));

        Collections.sort(std);

        for(Student student : std)
        {
            System.out.println("{" +student.name +", " +student.rollNumber+ " - "+student.marks +"}");
        }
    }
}

class Student implements Comparable<Student>
{
    String name;
    int rollNumber;
    int marks;

    Student (String name, int rollNumber, int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int compareTo(Student st)
    {
        if(marks == st.marks)
        {
            return 0;
        }else if (marks > st.marks)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}
