public class Cylinder{

    public static void main(String []args){
        MoreCylinder cylinder = new MoreCylinder(5.0,5.0);

        System.out.println("The volume of the Cylinder is " + cylinder.Volume());
        System.out.println("The surface area of the Cylinder is " + cylinder.SurfaceArea());
    }
}