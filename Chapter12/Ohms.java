import java.util.Scanner;
public class Ohms{


    public static void main (String [] args){
        Scanner scanV= new Scanner(System.in);
        System.out.println("What is the voltage");

        String inVoltageData = scanV.nextLine();
        Integer voltageInput = Integer.parseInt(inVoltageData);



        Scanner scanR = new Scanner(System.in);
        System.out.println("Voltage Input successful, what is the Resistence");

        String inResistenceData = scanR.nextLine();
        Integer resistenceInput= Integer.parseInt(inResistenceData);
        
        
       double V= voltageInput;
       double R= resistenceInput;
       double I= (V+0.0)/R;

       System.out.println("Both inputs successful I = " + I);

       scanR.close();
       scanV.close();
    }
}