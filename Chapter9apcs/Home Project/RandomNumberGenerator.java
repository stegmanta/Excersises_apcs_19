import java.util.Random;

public class RandomNumberGenerator{
    public static void main ( String[] args ) {
        try {

            int x=0;
            while(x<=10){
                Random ran = new Random();
                System.out.println("your lucky number is " + ran.nextInt(500));
                x++;
       
                Thread.sleep(1000);
                CountFive test = new CountFive();
                test.hello("Tayler");
                
            }
        } catch (Exception e) {

        }
    }


}