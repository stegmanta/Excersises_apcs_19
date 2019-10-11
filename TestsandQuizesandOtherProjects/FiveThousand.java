import java.util.Scanner;
import java.util.Random;

public class FiveThousand{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Random die = new Random();
        
        System.out.println("Weclome to the dice game 5000 with common scoring variations");
        System.out.println("The rules are simple each player rolls 5 die and can either keep rolling or stop rolling when you get 350 points ");
        System.out.println("The points go as shown");
        System.out.println("_______________________");
        System.out.println("The 1 dice = 100 points");
        System.out.println("The 5 dice = 50 points");
        System.out.println("Three of a kind, thrown ");
        System.out.println("");
        System.out.println("2's = 200");
        System.out.println("3's = 300");
        System.out.println("4's = 400");
        System.out.println("5's = 500");
        System.out.println("6's = 600");
        System.out.println("1's = 1000");
        
        

        System.out.println("Enter the first players name");
        String firstPlayer = scan.nextLine();
        if(firstPlayer.equals("Alex")){
            System.out.println("Congrats, you are a functioning member of society");
        }
        System.out.println("Enter the second players name");
        String secondPlayer = scan.nextLine();
        if(firstPlayer.equals("Alex")){
            System.out.println("Congrats, you are a functioning member of society");
        }
        
    }

}