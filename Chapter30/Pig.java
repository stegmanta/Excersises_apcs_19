import java.util.Random;
import java.util.Scanner;
public class Pig{

    public static void main (String []args){

        Random random = new Random();
        int cpuPoints = 0;
        int diceRoll = random.nextInt(18)+1;
        int totalPlayerPoints = 0;


        for(int playerPoints = 0,rollsRemaining = 3 ; playerPoints<100 && rollsRemaining>0; rollsRemaining--){

            if(rollsRemaining==3){
                totalPlayerPoints = playerPoints + diceRoll;
                System.out.println("The player has rolled a " + diceRoll + "and has a total point of" + playerPoints);
                diceRoll = random.nextInt(18)+1;
                
            }else if(rollsRemaining==2){
                totalPlayerPoints = playerPoints +diceRoll;
                
                System.out.println("The player has rolled a " + diceRoll + " and has a total points of" + diceRoll);
                
            }

        }
    }
}