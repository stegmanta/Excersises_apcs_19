public class MoreImmutableBox{

    private double width;
    private double height;
    private double length;
//constructors
    public MoreImmutableBox(double width,double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
     public MoreImmutableBox(){
        this.width = width;
        this.height = height;
        this.length = length;

    }

    // getters and setters
    public double GetWidth(){
        return this.width;
    }
    
    public double GetHeight(){
        return this.height;
    }
    
    public double GetLength(){
        return this.length;
    }

    public double SetWidth(){
        return this.width;
    }
    
    public double SetHeight(){
        return this.height;
    }
    
    public double SetLength(){
        return this.length;
    }

    //methods
    public double Volume(){
        return this.width*this.height*this.length;
    }
    
    public double Area(){
        return 2*((this.width*this.length)+(this.height*this.length)+(this.height*this.width));
    }
}