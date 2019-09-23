import java.util.Scanner;
//final - initial /gallons
public class Miles{

    public static void main(String [] args){

        boolean p = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Starting Initial miles:");
        Integer sIM = Integer.parseInt(scan.nextLine());

        while(sIM>0){

        System.out.println("Initial miles:");
        Integer iM = Integer.parseInt(scan.nextLine());

            if(iM>0){
        System.out.println("Final miles:");
        Integer fM = Integer.parseInt(scan.nextLine());

        System.out.println("Gallons:");
        Integer gallons = Integer.parseInt(scan.nextLine());

        int milesPerGallon = (fM-iM)/gallons;

        System.out.println("Miles per gallon:"+milesPerGallon);

        System.out.println("-----------------");

        }else{
            System.out.println("bye");
        }
    }
}
}
