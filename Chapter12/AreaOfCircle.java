import java.util.Scanner;

public class AreaOfCircle{

    public static void main (String []args){
        
        String radiusInputKey= new String ("Insert value for circle radius");
        Scanner scan = new Scanner(System.in);

        System.out.println(radiusInputKey);
        String inData = scan.nextLine();
        Integer radiusInput = Integer.parseInt(inData);

        double radiusInputSqaured = radiusInput*radiusInput;
        double area= Math.PI*radiusInputSqaured;

        System.out.println("The area of the circle is " + area);

        scan.close();
    }





}