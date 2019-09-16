import java.util.Scanner;
public class Sequential{

    public static void main (String []args){
        boolean doneYet = false;

        Scanner user = new Scanner(System.in);
        System.out.println("Enter N:");

        Integer nValue = Integer.parseInt(user.nextLine());

        int one = 1;
        int sum = (nValue*(nValue+1))/2;

        while(one<nValue)
        one = one + 1;
        doneYet = false;
        int loopSum = (nValue*(nValue+1))/2 +sum;
        if(!doneYet){
            System.out.println("Sum = " + sum);
            System.out.println("Loop Sum = " + loopSum);
        }

        }
    }
