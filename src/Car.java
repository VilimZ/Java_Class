import java.awt.*;

//  Data types:
//  int     ->    intiger 1, 2, 3...
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
}
