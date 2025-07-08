package src.com.vetias.java.workshop.basic;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args){
        LocalTime currentTime = LocalTime.now();
        LocalTime registrendTime= LocalTime.of(18,59,59);
        int hoursLeft=registrendTime.getHour()-currentTime.getHour();
        int minLeft=registrendTime.getMinute()-currentTime.getMinute();
        int secsLeft=registrendTime.getSecond()-currentTime.getSecond();
        System.out.println("you have "+hoursLeft+"hours "+minLeft+"min "+secsLeft+"seconds left");



    }

}
