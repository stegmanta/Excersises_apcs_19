import java.util.Random;
import java.util.Scanner;
public class Pig{

    public static void main (String []args){
        

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int totalPlayerPoints = 0;
        int totalCpuPoints = 0;
        int cpuTurns = 0;
        int playerDiceRoll = random.nextInt(6)+1;
        

        int cpuMessagePrinted = 1;
        int cpuMessagePrinted2 = 3;

        System.out.println("Welcome to pig, the dice game. At first the computer will roll two dice each round. When the cpu is finished the player can roll a die as many times as they want until they roll a '1' then you loose all of your points and it's the next round and the cpu plays again. The game ends when either you, the player or the cpu get's to a combined total of 100");
        System.out.println("-----------------------------------------");
        System.out.println("Type anything to start");
        String start = scan.nextLine();
        
        while(totalPlayerPoints<100 || totalCpuPoints<100){
            // System.out.println(cpuMessagePrinted);
            // System.out.println(cpuMessagePrinted2);
            // System.out.println(cpuTurns);
                for(cpuTurns = 3; cpuTurns>0 ; cpuTurns--,cpuMessagePrinted--,cpuMessagePrinted2--){
                    if(totalCpuPoints<100){ 
                        int cpuDiceRoll = random.nextInt(18)+1;
                        totalCpuPoints+=cpuDiceRoll;
                        if(cpuMessagePrinted>0){
                            System.out.println(" The computer rolled ");
                        }
                        System.out.print(" a, ");
                        System.out.println(cpuDiceRoll);
                        if(cpuMessagePrinted2==1){
                            System.out.println("With a combined total of " + totalCpuPoints);
                            System.out.println("It is now the players turn type, '4' to roll, type a '3' to stop rolling, BE CAREFUL if you roll a 1 after the start you loose your turn and all of your points");
                        }
                    }
                }
                System.out.println("Don't end your turn in the start or it will break aka u loose");
                int playerChoice = scan.nextInt();

                while(totalPlayerPoints<100 && playerChoice == 4){
                    totalPlayerPoints+=playerDiceRoll;

                    System.out.println("you rolled a " + playerDiceRoll);
                    System.out.println("With a combined total of " + totalPlayerPoints);
                    playerChoice = scan.nextInt();

                    if(playerChoice == 3){
                        System.out.println("You ended your turn, HOPEFULLY it was a smart move");
                        cpuTurns = 3;
                        cpuMessagePrinted2 = 2;
                        cpuMessagePrinted  = 1;
                        playerChoice = 0;
                    }
                    playerDiceRoll = random.nextInt(6)+1;
                    if(playerDiceRoll == 1){
                        System.out.println("Sorry you rolled a 1, lost your turn and all of your points it is now the computers turn GOOD LUCK YOUR GONNA NEED IT");
                        cpuTurns = 3;
                        cpuMessagePrinted2 = 3;
                        cpuMessagePrinted = 3;
                        playerChoice = 0;
                        totalPlayerPoints-=totalPlayerPoints;
                    } 
                }
        }    
                       
    }
}