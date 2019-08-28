import java.util.Scanner;
public class CentsToDollars{

    public static void main (String []args){

        String centsInputKey = new String ("How much cents do you have");
        Scanner scan = new Scanner(System.in);

        System.out.println(centsInputKey);
        String inData = scan.nextLine();
        Integer  centsInput = Integer.parseInt(inData);
    
        double dollars= centsInput/100;

        if (centsInput<100){
            System.out.println("you have 0 dollars and " + centsInput + " cents");
        }

        if (centsInput>=100){
            double cents = centsInput % 100; 
            System.out.println("You have " + dollars +" Dollars and " + cents + " cents" );



            scan.close();
        }


    }



}