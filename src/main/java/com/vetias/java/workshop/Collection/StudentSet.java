package com.vetias.java.workshop.Collection;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> studentIds = new HashSet<>();
        studentIds.add(01);
        studentIds.add(02);
        studentIds.add(03);
        studentIds.add(04);
        studentIds.add(05);
        System.out.println("Student Ids: " + studentIds
         );

    }

}
