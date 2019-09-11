import java.util.Scanner;
public class Dump{

    public static void main (String [] args){

        Scanner insertWeight= new Scanner(System.in);
        System.out.print("Insert the weight of the load of trash in pounds: ");

        String theWeight = insertWeight.nextLine();
        Integer trashWeight = Integer.parseInt(theWeight);
        int totalTrashCharge;

        if(trashWeight>200){
            totalTrashCharge = (trashWeight/100)-2;
            int theTotal = (totalTrashCharge*8)+20;
            System.out.println("total : $" + theTotal);
        }else if (trashWeight<=200){
            System.out.println("total : $20");
        }
    }
}