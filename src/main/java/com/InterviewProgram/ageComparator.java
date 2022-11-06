package com.InterviewProgram;

import java.util.Comparator;

class ageComparator implements Comparator<Student1> {

    public int compare(Student1 s1, Student1 s2)
    {
        if(s1.age == s2.age)
        {
          return 0;
        }else if(s1.age > s2.age)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}
