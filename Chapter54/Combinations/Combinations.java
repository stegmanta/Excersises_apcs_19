import java.util.Scanner;

public class Combinations{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
           

        System.out.print("Input N :");
        int userNInput = scan.nextInt();

        if(userNInput > 20){
            System.out.println("ERROR, N must be smaller than 20");
        }else{

        System.out.print("Input R :");
        int userRInput = scan.nextInt();

        

        int comboNCR = (userRInput*(userNInput-userRInput))/userNInput;

        System.out.println("The combo NcR is " + comboNCR);
        }
    }
}