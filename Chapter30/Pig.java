import java.util.Random;
import java.util.Scanner;
public class Pig{

    public static void main (String []args){

        Random random = new Random();
        int cpuPoints = 0;
        int dice = random.nextInt(18)+1;
        int rollsRemaining = 3;
        for(int playerPoints = 0; playerPoints<100 && rollsRemaining>0; rollsRemaining--){
            playerPoints+=dice;
            System.out.println("The player has rolled " + dice + " points");

        }
    }
}