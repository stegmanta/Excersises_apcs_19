public class MoreCylinder{
    private double radius;
    private double height;

    public MoreCylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    //getters and setters

    public double getRadius(){
        return this.radius;
    }

    public double getHeight(){
        return this.height;
    }
    //end of getters and setters

    public double Volume(){
        return (Math.PI)*(this.radius*this.radius)*this.height;
    }
    public double SurfaceArea(){
        return (Math.PI)*2*(this.radius*this.radius)+2*(Math.PI)*(this.radius*this.height);
    }
}