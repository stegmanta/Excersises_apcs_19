import java.util.Scanner;
public class MorePantryTester{
    Scanner scan = new Scanner(System.in);

    private int ounces;
    private int selection;

    public MorePantryTester(int ounces){
        this.ounces = ounces;
    }

    public MorePantryTester(){
        this.ounces = ounces;
    }


    public int getOunces(){
        return this.ounces;
    }

    public int getSelection(){
        return this.selection;
    }

}