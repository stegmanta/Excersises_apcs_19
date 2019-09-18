import java.util.Scanner;
public class AddingUp{

    public static void main(String []args){

        Scanner integer = new Scanner(System.in);
        System.out.println("How many integers will be added:");
        
        Integer totalInt = Integer.parseInt(integer.nextLine());

        int sum = 0;

        while(totalInt>0){
            
            System.out.println("Enter an integer:");
            Integer newInt= Integer.parseInt(integer.nextLine());
            sum = sum + newInt;
            totalInt--;
        }
        System.out.println("The sum is "+sum);

    }
}