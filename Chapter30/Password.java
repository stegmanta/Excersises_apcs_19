import java.util.Scanner;
import java.util.Random;

public class Password{

    public static void main(String []args){

        boolean guessedIt = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a secret password(if it's personal don't worry it's definitely secret)----> ");
        String userPassword = scan.nextLine();

        String library = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz!@#$%^&*()<>?:,./;'[]";
        Random random = new Random(); 
        String check = "initialize";
        int tries = 0;
        

        for(tries = 0;!check.equals(userPassword);tries++ ){
            check = "";
            for(int total = 0; total<userPassword.length() ; total++){

                check += library.charAt(random.nextInt(library.length()));
            }
        }
        if(check.equals(userPassword)){
            System.out.println("it took " + tries + " tries to guess it");
            System.out.println("Your password is : " + userPassword);
        }

    }
}
    