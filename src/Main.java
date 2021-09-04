import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World Java");
        System.out.println("Kathryn  ");

        Car myCar = new Car(25.4, "MO-223-P", Color.BLUE, true);
        Car sallyCar = new Car(13.5, "ZG-77-LE",Color.WHITE,true);

        System.out.println("My Car license plate: " + myCar.licensePlate);
        System.out.println("Sally's car license plate is: " +sallyCar.licensePlate);

    }


}
