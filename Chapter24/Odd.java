import java.util.Scanner;
public class Odd{

    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert n");
        int oddSum = 0;
        for(int n = scan.nextInt();n>0;){
            oddSum= oddSum+n;
            System.out.println(oddSum);
        }
    }
}
// to make this add the int in the for statement as 1 then make it while 1<=n 1=1+2;