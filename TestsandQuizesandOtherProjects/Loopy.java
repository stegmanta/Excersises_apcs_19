public class Loopy{

    public static void main (String[] args){
        doStuff(3,5);
        doStuff(4,6);

        System.out.println(doStuff(3,5) + doStuff(4,6));



    }

    // signature 
    public static int doStuff(int a, int b){
        int x = 0; // won't work outside of the function
        int result = a + b;
        return  result;
    }
    


}