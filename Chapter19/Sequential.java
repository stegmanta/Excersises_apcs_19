import java.util.Scanner;
public class Sequential{

    public static void main (String []args){
        boolean doneYet = false;

        Scanner user = new Scanner(System.in);
        System.out.println("Enter N:");

        Integer nValue = Integer.parseInt(user.nextLine());
        int loopSum = 0;
        int one = 1;
        int sum = (nValue*(nValue+1))/2;

        while(one<nValue){
        one = one + 1;
        doneYet = false;
        }
        if(!doneYet){
            loopSum = (sum*nValue)/one;
            System.out.println("Sum = " + sppum);
            System.out.println("Loop Sum = " + loopSum);
        }

        }
    }
