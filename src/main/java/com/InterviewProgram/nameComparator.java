package com.InterviewProgram;

import java.util.Comparator;

class nameComparator implements Comparator<Student1> {

    public int compare(Student1 s1 , Student1 s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
