import java.util.Random;

public class CarFactory {

    static Car create(String color){

      Random rand = new Random();
      int regnr = rand.nextInt(100000);

        return new Car(color, "volvo", regnr);
    };

}
