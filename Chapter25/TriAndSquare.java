import java.util.Scanner;
public class TriAndSquare{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert max number");
        int n = scan.nextInt();

        int totalOddNumb = 1;
        int totalOddSum = 1;

         for(int oddNumb = 1 ; oddNumb<=n ; oddNumb = oddNumb+totalOddNumb){
            totalOddNumb = oddNumb +3;
            totalOddSum =totalOddNumb+oddNumb;
            System.out.println(totalOddSum);
        }
    }
}