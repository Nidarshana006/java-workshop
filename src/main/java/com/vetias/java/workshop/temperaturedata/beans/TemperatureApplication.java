package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public class TemperatureApplication {
    public static void main(String[] args) {
        Organization org = new Organization(
            "Vetias Tech",
            "Thindal Erode",
            "www.vetias.com",
            "vetias@gmail.com",
            "9887745633",
            2354632,
        LocalDate.of(2018, 07, 25));
    System.out.println(org);
    }

}
