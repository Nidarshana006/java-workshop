package src.com.vetias.java.workshop.basic;
import java.util.Arrays;

public class Twodimensional {
    public static void main(String[] args){
        String employeedetails[][]=new String[5][2];
        employeedetails[0][0]="109";
        employeedetails[0][1]="0161";
        employeedetails[1][0]="10798";
        employeedetails[1][1]="80,541";
        employeedetails[2][0]="45311";
        employeedetails[2][1]="0654";
        employeedetails[3][0]="913,78";
        employeedetails[3][1]="1101";
        employeedetails[4][0]="90.411";
        employeedetails[4][1]="0097";
        employeedetails[5][0]="0143";
        employeedetails[5][1]="93611114";
        for(String[]employee:employeedetails){
            System.out.println(Arrays.toString (employee));
        }
    }
    
}
