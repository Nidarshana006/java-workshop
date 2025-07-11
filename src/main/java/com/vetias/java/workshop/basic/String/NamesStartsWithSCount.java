package com.vetias.java.workshop.basic.String;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesStartsWithSCount {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Selvi");
        names.add("Praga");
        names.add("Santhosh");
        names.add("Prabhu");
        names.add("Soniya");
        names.add("Vika");
        Long nameCount = names.stream()
        .filter(name -> name.startsWith("S")).count();
        System.out.println(nameCount);
    }

}
