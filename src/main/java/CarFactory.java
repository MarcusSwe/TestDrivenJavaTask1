import java.util.Random;

public class CarFactory {

    static int createRegNr(){
        Random rand = new Random();
        return rand.nextInt(100000);
    }

     public Car create(String color){
        String brand = "volvo";
        return new Car(color, brand, createRegNr());
    };


}
