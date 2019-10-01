import java.util.Scanner;
public class Divisors{

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the N value :");
        int n = scan.nextInt();

        int theSum = 0;
        int finalSum = 0;
        int aSum = 0;
        
        for (int sum = 1; sum<n ;sum++){
            theSum = n%sum;
            if(theSum == 0){
                finalSum = finalSum+sum;    
            }
            
        }
        if(finalSum == n){
                System.out.println("N is a Perfect number :)");
            }else{
                System.out.println("N is a Non perfect number");
            }
    }
}