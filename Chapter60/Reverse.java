class Reverse
{
  public static void main ( String[] args )
  {
    int[] val = {12, 21, 22, 33}; 
    int temp;
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
 
 //OK WHY ON EARTH WOULD YOU USE THE VARIABLE TEMP AND NOT JUST FLIP IT? IT'S SO POINTLESS!
    for(int counter = 0; counter < val.length / 2; counter++) {
            temp = val[(val.length - counter) - 1];
            val[(val.length - counter) - 1] = val[counter];
            val[counter] = temp;   
        }
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}