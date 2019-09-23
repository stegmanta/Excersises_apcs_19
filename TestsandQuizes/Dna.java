import java.util.Scanner;
public class Dna{

    public static void main (String []args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert begginning nucleotide");
        String nucleotide = userInput.nextLine();

        String q = "q";
        String a = "a";
        String t = "t";
        String c = "c";
        String g = "g";
        String match = "initialize";
        int tNumb = 0;
        int aNumb = 0;
        int cNumb = 0;
        int gNumb = 0;

        while(!nucleotide.equals(q)){
            System.out.println("Insert nucleotide, when finished enter 'q' :");
            nucleotide = userInput.nextLine();

            if(nucleotide.equals(a)){
                match = t;
                tNumb = tNumb+1;
            }else if(nucleotide.equals(t)){
                match = a;
                aNumb = aNumb+1;
            }else if(nucleotide.equals(c)){
                match = g;
                gNumb = gNumb+1;
            }else if(nucleotide.equals(g)){
                match = c;
                cNumb = cNumb+1;
            }

            
            
        }
        int total = tNumb+aNumb+cNumb+gNumb;
        if(aNumb/intTotal>.4){
            system.out.println("danger");
        }
    }
}