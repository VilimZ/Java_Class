import java.awt.*;



//  Data types:
//  int     ->    integer 1, 2, 3...
//  String  ->    "a12b" or "Hello World"
//  Color   ->    from awt library
//  boolean ->    true or false

public class Car {
    double averageMilesPerMiles;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car (double inputAverageMPG,
                String inputLicensePalate,
                Color inputPaintColor,
                boolean inputTileLightWorking){
        this.averageMilesPerMiles = inputAverageMPG;
        this.licensePlate = inputLicensePalate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputTileLightWorking;
    }
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public  double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}
