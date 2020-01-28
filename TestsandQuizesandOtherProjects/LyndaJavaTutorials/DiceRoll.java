import java.util.Scanner;
import java.util.Random;

public class DiceRoll{

    public static void main(String []args){
    int result = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert roll, to roll");
    String roll = scan.nextLine();
    int diceRoll =(int) Math.random()+6;

        if(roll.equals("roll")){
            result = diceRoll+diceRoll;
        }

        System.out.println(result);

    }

    // a lil broke but just have to fix random function and should work
}