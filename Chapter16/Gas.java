import java.util.Scanner;
public class Gas {
    public static void main(String[] args) {
        String gasTank;
        gasTank = new String("Insert Tank capacity in gallons");
        Scanner scan = new Scanner(System.in);
        System.out.println(gasTank);   
        String inData = scan.nextLine();
        Integer totalGas = Integer.parseInt(inData);
        int gasTotal = totalGas;

        String gasPercent;
        gasPercent = new String("Insert Gage reading (Percentage full)");
        System.out.println(gasPercent);   
        String inData1 = scan.nextLine();
        Integer totalPercent = Integer.parseInt(inData1);
        int gageTotalFinal = totalPercent;
        
        String MPG;
        MPG = new String("Insert Miles per gallon of your car");
        System.out.println(MPG);   
        String inData2 = scan.nextLine();
        Integer totalMPG = Integer.parseInt(inData2);
        int mPGTotal = totalMPG;
        double gasFinal = ((gageTotalFinal * .01) * gasTotal) * mPGTotal;

        if(gasFinal < 200) 
        System.out.println("Get Gas!");
        else
        System.out.println("You are safe for departure!");
    }
}