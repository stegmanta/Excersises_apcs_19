public class ThreeArrays{

    public static void main(String[]args){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  valA[0]+valB[0], valA[1]+valB[1], valA[2]+valB[2], valA[3]+valB[3]};
    
        // Add values from corresponding cells of valA and valB
        // and put the result in the corresponding cell of sum.



 
        System.out.println( "sum: " 
            + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
}