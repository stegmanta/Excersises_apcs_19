import java.io.*;
import java.util.Scanner;
public class Panagram{
    

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String userSentance = scan.nextLine() ;
        char alphabetArray[] = new char [25];
        int count = 0 ;

        for(int index = 0; index < userSentance.length(); index++){
            // System.out.println(userSentance.charAt(index));
            boolean found = false;
            char character = userSentance.charAt(index);

            for(int index2 = 0; index2 < alphabetArray.length ;index2++){
                char currChar = alphabetArray[index2];
                if(currChar == character){
                    found = true;
                    break;
                }
            }
            if(!found){
                alphabetArray[index] = character;
                count++;
            }
        }

    
        if(count == 25){
        System.out.println("The sentence " + userSentance + " is a Panagram");
        }else{
        System.out.println("The sentence " + userSentance +" is not a Panagram");
        }
    }
}





































//a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z