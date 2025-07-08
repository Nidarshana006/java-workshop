package src.com.vetias.java.workshop.basic;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your date of birth(YYYY-MM-DD):");
        String dateofbirth=sc.nextLine();
        LocalDate birthdate = LocalDate.parse(dateofbirth);
        int yearofbirth = birthdate.getYear();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearofbirth;
        System.out.println("Your age is :"+age);
    }

}
