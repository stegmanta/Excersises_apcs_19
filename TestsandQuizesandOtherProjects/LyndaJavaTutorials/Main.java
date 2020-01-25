import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.awt.*;

public class Main{
//variables and data types practice

    public static void main (String []args){
        String userInput = "JingleJohn";

        Car myCar = new Car(25.5,"1BC32E",Color.BLUE,true);

        Car sallyCar = new Car(13.9,"32",Color.BLACK,false);

        // System.out.println("My plate " + myCar.licensePlate);
        // System.out.println("Sally Plate " + sallyCar.licensePlate);

        
        myCar.changePaintColor(Color.RED);
        // System.out.println(myCar.paintColor);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);
        


        //Array practice

        int[] numbers = new int[5];
        numbers [0] = 31;
        numbers [1] = 45;
        numbers [2] = 22;
        numbers [3] = 98;
        numbers [4] = 10;

        int[] numbers2={31,45,22,98,10};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandyBars = {"Twix" , "Hersheys", "Crunch"};
        // System.out.println("Index 1;" + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        // System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        // System.out.println("Length: " + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars, 2));



    }
}