import java.util.Scanner;
public class Age{

    public static void main (String[]args){

        Scanner yourAge = new Scanner(System.in);
        System.out.println("Insert age in years");
        
        String inAge = yourAge.nextLine();
        Integer yourFinalAge = Integer.parseInt(inAge);

        int yourAgeInYears= yourFinalAge;

        System.out.println("Insert how many months since last birthmonth");
        
        String inAgeMonths = yourAge.nextLine();
        Integer yourFinalAgeInMonths = Integer.parseInt(inAgeMonths);

        int yourAgeInMonths = yourFinalAgeInMonths;

        System.out.println("Insert the day of the month it is");
        
        String inAgeDays = yourAge.nextLine();
        Integer yourFinalAgeInDays = Integer.parseInt(inAgeDays);

        int yourAgeInDays = yourFinalAgeInDays;

        int yourAgeInSeconds = (yourAgeInYears*31536000)+(yourAgeInDays*86400)+(yourAgeInMonths*2678400);

        double billion = 2.5E9;
        double percentLifespan = (yourAgeInSeconds/billion)*100;      
        System.out.println("your age in seconds is "+ yourAgeInSeconds);
        System.out.println("----------------");
        System.out.println("the percentage of the lifespan you have lived is " + percentLifespan+"%");


    }
}