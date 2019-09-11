import java.util.Scanner;
public class CheckCharge{

    public static void main (String [] args){

        Scanner insertBalance= new Scanner(System.in);
        System.out.print("Insert the balance in your checking: $ ");

        String theChecking = insertBalance.nextLine();
        Integer yourChecking = Integer.parseInt(theChecking);

        int checking = yourChecking;


        System.out.print("Insert the balance in your checking: $");

        String theSavings = insertBalance.nextLine();
        Integer yourSavings = Integer.parseInt(theSavings);

        int savings = yourSavings;

        if(checking<1000 || savings<1500 ){
            System.out.println("Service fee $0.15 per check");
        }else if(checking>=1000 || savings>=1500){
            System.out.println("No service fee charge");
        }
    }
}