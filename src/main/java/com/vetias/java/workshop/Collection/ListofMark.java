package com.vetias.java.workshop.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListofMark {
    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(90);
        marks.add(60);
        marks.add(40);
        marks.add(70);
        Collections.sort(marks);
        System.out.println("Sorted List of Marks in acending: " + marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Sorted List of Marks in descending: " + marks);
        System.out.println("Minimum mark: " + Collections.min(marks));
        System.out.println("Maximum mark: " + Collections.max(marks));

    }
}
