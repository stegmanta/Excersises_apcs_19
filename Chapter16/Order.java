import java.util.Scanner;
public class Order{

    public static void main (String []args){

    

        Scanner amountofToolItems = new Scanner(System.in);
        System.out.println("Insert amout of bolts");
        
        String inBolts = amountofToolItems.nextLine();
        Integer totalBotls = Integer.parseInt(inBolts);

        int bolts= totalBotls;



        System.out.println("Insert amount of nuts");
        
        String inNuts = amountofToolItems.nextLine();
        Integer totalNuts = Integer.parseInt(inNuts);

        int nuts= totalNuts;

        System.out.println("Insert amount of washers");
        String inWasher = amountofToolItems.nextLine();
        Integer totalWashers = Integer.parseInt(inWasher);

        int washers = totalWashers;
       

        if(nuts >= bolts){
            System.out.println("Number of bolts: " + bolts);
            System.out.println("Number of nuts: " + nuts);
            System.out.println("Number of washers: " + washers);
            System.out.println("Order is OK");
        }else if(){
            System.out.println("Number of bolts: " + bolts);
            System.out.println("Number of nuts: " + nuts);
            System.out.println("Number of washers: " + washers);
            System.out.println("Check the Order: too few nuts");
        }else if(2*washers<bolts){
                System.out.println("Check the order: too few washers");
                }else{
                System.out.println("Number of bolts: " + bolts);
                System.out.println("Number of nuts: " + nuts);
                System.out.println("Number of washers: " + washers);
                System.out.println("Check the order: too few nuts");
                System.out.println("Order is OK");
                }






        

    }
}