import java.util.Scanner;
public class Odious{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean process = true;
        System.out.println("Type in a number too see if It's Odius Or Evil");
        int Usernumber = scan.nextInt();
        int saveUsernumber = Usernumber;
        int Odiouscounter = 0;
        

        while(process){

            int binary = Usernumber%2;
            // System.out.println(binary);
            if(binary == 1){
                Odiouscounter++;
            }
            int dividend = Usernumber/2;
            // System.out.println(dividend);

            if (dividend == 0){
                process = false;
            }
            Usernumber = dividend;
        }
        System.out.println("------------");
        if((Odiouscounter % 2) == 1){
        System.out.println(saveUsernumber +" is an Odius number");
        }else{
        System.out.println(saveUsernumber +" is a Evil number");
        }

        
    }
}