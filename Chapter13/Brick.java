import java.util.Scanner;
public class Brick{


    public static void main (String [] args){


        Scanner scanS= new Scanner(System.in);
        System.out.println("Enter the number of seconds");

        String secondsInput = scanS.nextLine();
        Double seconds = Double.parseDouble(secondsInput);

        double SecondsSquared = seconds*seconds;
        double Distance = 32.174*SecondsSquared;

        System.out.println("the distance is " + Distance);




        scanS.close();
        
        
    }
}