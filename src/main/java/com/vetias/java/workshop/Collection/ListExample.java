package com.vetias.java.workshop.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Praga");
        names.add("Santhosh");
        names.add("Prabhu");
        names.add("Soniya");
        System.out.println("Names List:" + names);
        for(String name : names){
            System.out.println("Name: " + name);
        }
        for (int i=0;i < names.size();i++){
            System.out.println("Name at index" + i + ":" + names.get(i));
        }
    }

}
