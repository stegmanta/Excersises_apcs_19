import java.util.Scanner;
public class Odious{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean process = true;
        System.out.println("Type in a number too see if It's Odius Or Evil");
        int userNumber = scan.nextInt();
        int saveuserNumber = userNumber;
        int odiousCounter = 0;
        

        while(process){

            int binary = userNumber%2;
            // System.out.println(binary); check the binary pattern
            if(binary == 1){
                odiousCounter++;
            }
            int dividend = userNumber/2;
            // System.out.println(dividend);

            if (dividend == 0){
                process = false;
            }
            userNumber = dividend;
        }
        System.out.println("------------");
        if((odiousCounter % 2) == 1){
        System.out.println(saveuserNumber +" is an Odius number");
        }else{
        System.out.println(saveuserNumber +" is a Evil number");
        }

        
    }
}