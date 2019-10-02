import java.util.Scanner;
import java.util.Random;
public class Guess{

    public static void main (String []args){

        Random num = new Random();
        int luckyNum = num.nextInt(10)+1;

        Scanner scan = new Scanner(System.in);
        System.out.println("I am thinking of a number from 1 to 10, guess the number in three tries");

        boolean right = false;
        for(int guesses = 3 ; guesses>0 ; guesses--){
            System.out.println("Enter a guess");
            int guess = scan.nextInt();
            if(guess == luckyNum){
                System.out.println("Congrats you guessed the number");
                right = true;
                guesses = 0;
            }else{
                System.out.println("Wrong");
                right = false;
            }

        }
        if(!right){
            System.out.println("Sorry you lost");
            System.out.println("The correct number was " + luckyNum);
        }


        


    }
}