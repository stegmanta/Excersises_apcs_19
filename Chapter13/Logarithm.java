import java.util.Scanner;

public class Logarithm {

    public static void main (String [] args){

        Scanner scanX= new Scanner(System.in);
        System.out.println("Enter a double");

        String in = scanX.nextLine();
        Double inDouble = Double.parseDouble(in);
        Double base2 = Math.log(inDouble)/Math.log(2);
        
        System.out.println("Base 2 log of " + inDouble + " is " + base2);
    }
}