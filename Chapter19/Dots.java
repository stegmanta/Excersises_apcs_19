import java.util.Scanner;
public class Dots{

    public static void main (String [] args){

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = enter.nextLine();
        int first = firstWord.length();

        System.out.println("Eneter second word:");
        String secondWord = enter.nextLine();
        int second = secondWord.length();


        int strTotalLength = second+first;
        int totalLenght = 30-strTotalLength;
        int amountODots = 0;

        while(totalLenght>0){
            totalLenght =totalLenght-1;
            amountODots = amountODots +1;    
        }

        System.out.print(firstWord);
        while(amountODots>0){
            amountODots = amountODots-1;
            System.out.print(".");
        }
        System.out.print(secondWord);

    }   
}