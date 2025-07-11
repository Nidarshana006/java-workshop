package com.vetias.java.workshop.basic.String;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {56,90,30,70,60};
        long numberOfSubjectsPassed = Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println(numberOfSubjectsPassed);
        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectsPassed=markStream
        .filter(mark -> mark > 40).count();
    }

}
