import java.util.Scanner;
public class PantryTester{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int amount;

        MorePantryTester gooseberry = new MorePantryTester(12);
        MorePantryTester crabApple = new MorePantryTester(8);
        MorePantryTester rhubarb = new MorePantryTester(16);

        System.out.println("Welcom to Mother Hubbard's Pantry! ");
        
       


        for (String selection = "0"; !selection.equals("-1"); selection = scan.nextLine()){
             
            System.out.println("The jams are: ");
            System.out.println("1: Gooseberry   7/4/86 " + gooseberry.GetOunces() +" fl. oz. ");
            System.out.println("2: Crab Apple   9/30/99 " + crabApple.GetOunces() + " fl. oz. ");
            System.out.println("3: Rhubarb   10/31/99 " + rhubarb.GetOunces() + " fl. oz. ");
            System.out.println("Enter your selection (1, 2, or 3):");

            if(selection.equals("1")){
                if(gooseberry.GetOunces()>0){
                    System.out.println("Enter amount to spread: ");
                    amount = scan.nextInt();
                }
            }
        }

    }
}