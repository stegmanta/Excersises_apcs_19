import java.util.Scanner;

public class Harmonic{

    public static void main(String [] args) {
       
        Scanner scanX= new Scanner(System.in);
        System.out.println("What is X");

        String inX = scanX.nextLine();
        Double X = Double.parseDouble(inX);


        Scanner scanY= new Scanner(System.in);
        System.out.println("What is Y");

        String inY = scanY.nextLine();
        Double Y = Double.parseDouble(inY);

        Double H = 2/ (1/X + 1/Y);

        int A = (int)Math.round(2/ (1/X + 1/Y));

        System.out.println("The harmonic mean is " + H + "The arithmetic " + A);
        

        scanY.close();
        scanX.close();






    }

}