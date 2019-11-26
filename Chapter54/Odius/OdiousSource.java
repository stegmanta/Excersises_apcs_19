public class OdiousSource{
        private int number = 0;
        private int binary = 0;
        
        public int OdiousSource(){
        
            for (number = 1; binary != 0; number = number + 1  ){
                binary = (number % 2)/2;
                System.out.println(number);
                System.out.println(binary);
            }

            return binary;
        }
        
}