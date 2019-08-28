import java.util.Scanner;

public class CorrectChange{

    public static void main (String []args){
        
        
        String totalChangeInput= new String ("Insert total amount of change");
        Scanner scan = new Scanner(System.in);

        System.out.println(totalChangeInput);
        String inData = scan.nextLine();
        Integer totalChange = Integer.parseInt(inData);

        double dollar;
        double quarter;
        double dime;
        double nickle;
        double penny;
            dollar = totalChange/100;
            quarter = (totalChange %100)/25;
            dime = (totalChange %100)/10;
            nickle = (totalChange%100)/5;
            penny = (totalChange%100)/1;
            System.out.println("The amount of dollars is " + dollar + " the amount of quarter "+ quarter + " the amount of dimes " + dime + "the amount of nickles"+ nickle + " the amount of pennies " + penny);

        
        
        
        
        // System.out.println("Total change is " + totalChange);


        scan.close();

        }

    


}