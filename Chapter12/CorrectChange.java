import java.util.Scanner;

public class CorrectChange{

    public static void main (String []args){
        
        
        String totalChangeInput= new String ("Insert total amount of change");
        Scanner scan = new Scanner(System.in);

        System.out.println(totalChangeInput);
        String inData = scan.nextLine();
        Integer totalChange = Integer.parseInt(inData);


        


        scan.close();

        }

    


}