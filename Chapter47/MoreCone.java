public class MoreCone{

        private double height;
        private double radius;
        

        public MoreCone(double radius, double height){
            this.radius = radius;
            this.height = height;
        }
        

        //getters and setters

        public double GetHeight(){
            return this.height;
        }

        public double GetRadius(){
            return this.radius;
        }

        //end of getters and setters

         public double SlantHeight(){
            return (this.radius*this.radius)+(this.height*this.height);
        }

        public double Angle(){
            return (this.height/this.radius);
        }

        // public static void test(){
        //     System.out.println("hey");
        // }

}