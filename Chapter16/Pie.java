import java.util.Scanner;
public class Pie{

    public static void main (String []args){
        Scanner weight = new Scanner(System.in);
        System.out.println("What is your weight");

        String weightIn = weight.nextLine();
        Integer weightAmount = Integer.parseInt(weightIn);
        int max = 280;
        int min = 220;

        if(weightAmount>=min && weightAmount<=max){
            System.out.println("Congrats your allowed in the contest");

        }else{
            System.out.print("sorry your too fat or skinny for the heavy weight division");
        }


    }

}