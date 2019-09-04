import java.util.Scanner;
public class SignUp{

    public static void main (String[] args){

        boolean user1 = false;
        boolean user2 = false;
        boolean user3 = false;
        boolean valid = false;
        String taken = "Username taken";

        Scanner scanUsername = new Scanner(System.in);
        System.out.println("Submit a unique username");

        String inUserData = scanUsername.nextLine();


        String takenUsername1 = "gary";
        String takenUsername2 = "skater_gurl";
        String takenUsername3 = "admin person";
        String takenUsername4 = "jimbob234";


          if(inUserData.equals(takenUsername1)){
              System.out.println(taken);
          }else if(inUserData.equals(takenUsername2)){
              System.out.println(taken);
          }else if(inUserData.equals(takenUsername3)){
              System.out.println(taken);
          }else if (inUserData.equals(takenUsername4)){

          } else{
              Scanner scanPassword = new Scanner(System.in);
              System.out.println("Please insert password");

              String inPassData = scanPassword.nextLine();

          }

}
}



          

   

    

