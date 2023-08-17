package com.hillel.course2.lesson5;

import java.util.Comparator;

public class BirdColorLengthComparator implements Comparator<Bird> {

    public int compare(Bird o1, Bird o2) {
        return o1.getColor().length() - o2.getColor().length();
    }
}
