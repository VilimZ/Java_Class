import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Enter a word: ");
  /*      Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains : " + userInput.contains("Enter".toLowerCase()));

         System.out.println("Hello World Java");
        System.out.println("Kathryn  ");*/

       Car myCar = new Car(25.4, "MO-223-P", Color.BLUE, true);
        Car sallyCar = new Car(13.5, "ZG-77-LE",Color.WHITE,true);

     /*   System.out.println("My Car license plate: " + myCar.licensePlate);
        System.out.println("Sally's car license plate is: " +sallyCar.licensePlate);

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.green);
        System.out.println(myCar.paintColor);*/

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);
    }


}
