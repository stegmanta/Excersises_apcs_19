import java.util.Scanner;
public class TriAndSquare{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert max number");
        int pattern = 1;
        int max = scan.nextInt();
        int add = 2;

        while(pattern <= max){
            pattern = pattern + add;
            System.out.println(pattern);
            add++;
        }
    }
}