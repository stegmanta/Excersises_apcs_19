import java.awt.*;

public class Car{

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    //constructors

    public Car(double averageMilesPerGallon, String licensePlate, Color paintColor, boolean areTailingWorking){
        this.averageMilesPerGallon = averageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailingWorking = areTailingWorking;
    }
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}