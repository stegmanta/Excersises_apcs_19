import java.util.Scanner;
public class Run{

    public static void main (String []args){
        
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Start:");

        Integer startNumber = Integer.parseInt(value.nextLine());
        
        int start = startNumber;

        System.out.println("Enter End:");

        Integer endNumber = Integer.parseInt(value.nextLine());

        int end = endNumber;
        while(start<end){
        start = start+1;
        System.out.println(start);
        }
        

    }
    
}