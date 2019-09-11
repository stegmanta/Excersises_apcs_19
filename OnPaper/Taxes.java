import java.util.Scanner;

public class Taxes{


    public static void main (String []args){

        double taxRate = 0.0;

        Scanner income = new Scanner(System.in);
        System.out.print("Insert Yearly Income in USD : $");

        String theIncome = income.nextLine();
        Integer yourIncome = Integer.parseInt(theIncome);

        if(yourIncome>=0 && yourIncome<=15000){
            taxRate = 0.0;
        }else if(yourIncome>=15000 && yourIncome<=35000){
            taxRate = .10;
        }else if(yourIncome>=35000 && yourIncome<=65000){
            taxRate = .16;
        }else if(yourIncome>=65000 && yourIncome<=105000){
            taxRate = .19;
        }else if(yourIncome>=105000){
            taxRate = .22;
        }

        double totalPaid = (yourIncome*taxRate)-2000;
        double percentOfTotal = (totalPaid/yourIncome)*10;

        System.out.println("Total paid $" + totalPaid);
        System.out.println(percentOfTotal+ " percent of " +yourIncome);

    }
}