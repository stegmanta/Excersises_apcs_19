import java.util.Scanner;
public class P{

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting character number");
        Integer start = Integer.parseInt(scan.nextLine());
        String w = "hey";

        w = w.substring(start,3);

        System.out.println(w);
    }
}