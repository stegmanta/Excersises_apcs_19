import java.util.Scanner;
public class SignUp{

    public static void main (String[] args){

        Scanner scanUsername = new Scanner(System.in);
        System.out.println("Submit a unique username");

        String inUserData = scanUsername.nextLine();


        String takenUsername1 = ("gary");
        String takenUsername2 = ("skater_gurl");
        String takenUsername3 = ("admin person");
        String takenUsername4 = ("jimbob234");

        if(inUserData.equals(takenUsername1,takenUsername2,takenUsername3,takenUsername4)){
            System.out.println("Username taken");


        }

    }


}