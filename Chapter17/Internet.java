import java.util.Scanner;
public class Internet{

    public static void main (String []args){

        Scanner menuItem= new Scanner(System.in);
        System.out.print("Insert the item your purchasing: ");

        String itemName = menuItem.nextLine();
        String finalItemName = itemName;


        System.out.print("Insert price of items in USD: ");

        String itemPrice = menuItem.nextLine();
        Double totalItemPrice = Double.parseDouble(itemPrice);
        Double theItemPrice = totalItemPrice;

        
        System.out.print("Do you want Overnight delivery type 'y' for yes and 'n' for no: ");

        String inExpress = menuItem.nextLine();
        String finalInExpressChoice = inExpress;
        String y = "y";
        String n = "n";
        Double shipping;
        if(theItemPrice<10){
            shipping = 2.0;
        }else{
            shipping = 0.0;
        }
        Double shippingWithOverN = shipping+3.0; 
        Double totalWOverN = theItemPrice+shippingWithOverN;
        Double totalWOOverN = theItemPrice+shipping;

        if(finalInExpressChoice.equals(y)){
            System.out.println("What's good? Is that potato salad? Yo, listen");
            System.out.println("Invoice:");
            System.out.println(finalItemName+"    " + theItemPrice);
            System.out.println("Delivery    " + shippingWithOverN);
            System.out.println("total       " + totalWOverN );

        }else if(finalInExpressChoice.equals(n)){
                System.out.println("What's good? Is that potato salad? Yo, listen");
                System.out.println("Invoice:");
                System.out.println(finalItemName+"    " + theItemPrice);
                System.out.println("Delivery    " + shipping);
                System.out.println("total       " + totalWOOverN );

        }else{
            System.out.println("Input wrong try again");
           
        }




        
    }
}