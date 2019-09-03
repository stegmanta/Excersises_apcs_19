import java.util.Scanner;
public class SignUp{

    public static void main (String[] args){

        boolean user1 = true;
        boolean user2 = true;
        boolean user3 = true;

        Scanner scanUsername = new Scanner(System.in);
        System.out.println("Submit a unique username");

        String inUserData = scanUsername.nextLine();


        String takenUsername1 = ("gary");
        String takenUsername2 = ("skater_gurl");
        String takenUsername3 = ("admin person");
        String takenUsername4 = ("jimbob234");


            if(inUserData.equals(takenUsername1)){
                user1 = true;
                System.out.println("Username taken");

            }else{
                user1 = false;
                Scanner scanPassword = new Scanner(System.in);
                System.out.println("User valid,  insert password");

                String inPasswordData = scanPassword.nextLine();
        }

        if(!user1){
            if(inUserData.equals(takenUsername2)){
                user2 =true;
                System.out.println("Username taken");


            }else{
                user2 = false;
                Scanner scanPassword = new Scanner(System.in);
                System.out.println("User valid,  insert password");

                String inPasswordData = scanPassword.nextLine();
            }
        }

        if(!user2){
            if(inUserData.equals(takenUsername3)){
            System.out.println("Username taken");
            user3 = true;
            

         }else{
            user3 = false;
            Scanner scanPassword = new Scanner(System.in);
            System.out.println("User valid,  insert password");

            String inPasswordData = scanPassword.nextLine();

        }
    }


        }

    }


