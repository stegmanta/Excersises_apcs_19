import java.util.Scanner;
import java.util.Random;

public class Farkle{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Random die = new Random();
        
        System.out.println("Enter the first players name");
        String firstPlayer = scan.nextLine();

        System.out.println("Enter the second players name");
        String secondPlayer = scan.nextLine();

        System.out.println("Weclome to Farkle, the rules are n word");
    }
}