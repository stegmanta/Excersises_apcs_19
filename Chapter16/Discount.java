import java.util.Scanner;
public class Discount {

    public static void main (String []args){
        Scanner amount = new Scanner(System.in);
        System.out.println("insert amount");
        
        String totalAmount = amount.nextLine();
        Integer completeAmount = Integer.parseInt(totalAmount);

        Double discountedPrice = completeAmount*.1;

        if(completeAmount>10.0){
        System.out.println("your discounted price is $" + discountedPrice);

        }else{
            System.out.println("Discounts are only applied to items over $10 your total is  " + completeAmount);
        }

    }


}