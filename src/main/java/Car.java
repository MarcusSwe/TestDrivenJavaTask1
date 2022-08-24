import lombok.Getter;

@Getter
public class Car {

    String color;
    String brand;
    int regnr;

    public Car(String color, String brand, int regnr){
        this.color = color;
        this.brand = brand;
        this.regnr = regnr;
    }

}
