import java.util.Scanner;
public class SubFun{


    public static void main (String [] args){
        
        Scanner scanStr= new Scanner(System.in); // starts scan for user input string
        System.out.println("What do you want to say");

        String userSentance = scanStr.nextLine(); // users sentance


        Scanner scanBegIndex= new Scanner(System.in); // starts scan for user beginning index input
        System.out.println("Input successfull, you are saying:" + userSentance +":now what would you like the beginning index to be");

        String begIndexInput = scanBegIndex.nextLine();
        Integer begInput = Integer.parseInt(begIndexInput); // users beginning index input in


        Scanner scanEndIndex= new Scanner(System.in); // starts scan for user end index input
        System.out.println("Beginning index input successfull what would you like the end index to be");

        String endIndexInput = scanEndIndex.nextLine();
        Integer endInput = Integer.parseInt(endIndexInput);

        String finalString = userSentance.substring(begInput,endInput);

        System.out.println("End Index Input sucessful,   your new string is----->" + finalString );

        
        scanStr.close();
        scanBegIndex.close();
        scanEndIndex.close();
    }




}