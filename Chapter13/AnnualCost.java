import java.util.Scanner;
public class AnnualCost{


    public static void main (String [] args){


        Scanner scanKHP= new Scanner(System.in);
        System.out.println("What is the cost per kilowatt-hour in cents");

        String inKiloPerHour = scanKHP.nextLine();
        Float kiloPerHour = Float.parseFloat(inKiloPerHour);
        

        Scanner scanKH= new Scanner(System.in);
        System.out.println("What is the killowat-hours used per year");

        String priceInKiloPerHour = scanKH.nextLine();
        Float priceKiloPerHour = Float.parseFloat(priceInKiloPerHour);

        double annualCost= priceKiloPerHour*kiloPerHour;

        System.out.println("the annual cost is"+ annualCost);
        

        
    }

}