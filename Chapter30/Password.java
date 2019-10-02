import java.util.Scanner;
import java.util.Random;

public class Password{

    public static void main(String []args){

        boolean guessedIt = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a secret password(if it's personal don't worry it's definitely secret)---->");
        String userPassword = scan.nextLine();
        System.out.println("Your password is :" + userPassword);

        String library = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz!@#$%^&*()<>?:,./;'[]";
        Random gotIt = new Random();
        String cracker = library.substring(gotIt.nextInt() * library.length());
        int total = 0;
        int tries = 1; 

        if(cracker.equals(userPassword)){
            guessedIt = true;
        }
        while(!guessedIt){
            total= total+tries;
        }

    }
}