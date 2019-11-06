public class Cone{

    public static void main(String []args){
        MoreCone cone = new MoreCone(5.0, 5.0);

        // MoreCone.test(); static 

        System.out.println("the slant height of the cone is "+ cone.SlantHeight());
        System.out.println("the angle at the apex of the cone is " + cone.Angle());
    }
 
}