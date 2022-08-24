import java.util.Random;

public class CarFactory {

    static int createRegNr(){
        Random rand = new Random();
        return rand.nextInt(100000);
    }

    private final static String brand = "volvo";

    static Car create(String color){

        return new Car(color, brand, createRegNr());
    };

}
