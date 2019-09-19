import java.util.Scanner;
public class Harmonic{

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");

        Integer nValue = Integer.parseInt(scan.nextLine());
        Double sum = 0.0;
        Double totalSum = 0.0;
        System.out.println(nValue);
        while(nValue>0.0){
            sum = 1.0/nValue;
            System.out.println(sum);
            totalSum = totalSum + sum;
            nValue--;      
        }
        System.out.println("Sum is: " + totalSum);
    }
}