import java.util.Scanner;
public class Birthday{

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int numPeople;
        final double days = 365;
        double possible = 1;

        System.out.println("What is the amount of people at the party:");
        numPeople = scan.nextInt();

        for(int i = 1; i <= numPeople; i++) {
            if (i == 1) {
                possible = (days - (i - 1)) / days;
            }else {
                possible = possible * ((days - (i - 1)) / days);
            }
        }
        System.out.println("The possibility someone will have the same birthday " + possible);

        int x = 0;
        possible = 1;
        for(x = 1; possible >= 0.5; x++) {
            if (x == 1) {
                possible = (days - (x - 1)) / days;
            }else {
                possible = possible * ((days - (x - 1)) / days);
            }
        }
    }
}

