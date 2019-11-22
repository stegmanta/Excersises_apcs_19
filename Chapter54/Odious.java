public class Odious{

    public static void main(String[]args){
        int number = 0;
        int binary = 0;
        
        for (number = 1; !binary == 0; number = number + 1  ){
            binary = (number % 2)/2;
            System.out.println(number);
            System.out.println(binary);
        }
    }
}