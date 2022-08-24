import lombok.Getter;

@Getter
public class Car {

    String color;
    String brand;
    int regnr;
    String engine;

    public Car(String color, String brand, int regnr, String engine){
        this.color = color;
        this.brand = brand;
        this.regnr = regnr;
        this.engine = engine;
    }

}
