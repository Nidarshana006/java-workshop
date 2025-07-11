package com.vetias.java.workshop.basic.String;
import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Selvi");
        names.add("Sharni");
        names.add("Nivin");
        names.add("Nivetha");
        names.add("Krish");
        names.stream()
        .filter(name -> name.startsWith("S") || name.startsWith("S"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
