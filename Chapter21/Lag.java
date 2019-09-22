import java.util.Scanner;
public class Lag{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What was your total hours traveled :");
        Double hours = Double.parseDouble(scan.nextLine());

        System.out.println("How many time zones did you cross :");
        Double zones = Double.parseDouble(scan.nextLine());

        System.out.println("What was your departure time :");
        Double depart = Double.parseDouble(scan.nextLine());

        System.out.println("What was your arrival time:");
        Double arrive = Double.parseDouble(scan.nextLine());

        double recovery = (hours/2 + (zones-3) + depart + arrive)/10;

        System.out.println("You need " +recovery+" days of recovery");

    }
}