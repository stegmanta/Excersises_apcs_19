import java.util.Scanner;

public class CorrectChange{

    public static void main (String []args){
        
        
        String totalChangeInput= new String ("Insert total amount of change");
        Scanner scan = new Scanner(System.in);

        System.out.println(totalChangeInput);
        String inData = scan.nextLine();
        Integer totalChange = Integer.parseInt(inData);

        
        
           int dollar = totalChange/100;

            int quarter = (totalChange - dollar * 100)/25;
            
            int dime = (totalChange - dollar * 100 - quarter * 25)/10;

            int nickle = (totalChange - dollar * 100 - quarter *25 - dime * 10)/5;

           int penny = (totalChange - dollar *100 - quarter*25 - dime *10 - nickle*5)/1;

            System.out.println("The amount of dollars is " + dollar + " the amount of quarter "+ quarter + " the amount of dimes " + dime + " the amount of nickles "+ nickle + " the amount of pennies " + penny);

        
        
        
        
        // System.out.println("Total change is " + totalChange);


        scan.close();

        }

    


}