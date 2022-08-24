import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BilFabrikTest {

    Car car;
    Car hondaCar;
    CarFactory carFactory = new CarFactory();
    HondaCarFactory newBrandCar = new HondaCarFactory();

    @BeforeEach
    void setUp() {
        car = carFactory.create("blue");
        hondaCar = newBrandCar.create("blue");
    }

    @Test
    public void getCarColorTest(){
        assertEquals("blue", car.getColor());
    }

    @Test
    public void getCarBrandTest(){
        assertEquals("volvo", car.getBrand());
    }

    /*
    @Test
    public void getCarBrandTestofTestShouldFail(){
        assertEquals("honda", car.getBrand());
    }*/

    @Test
    public void checkNewBrand(){
        assertEquals("honda", hondaCar.getBrand());
    }

    @Test
    public void checkNewBrandCarColor(){
        assertEquals("blue", hondaCar.getColor());
    }

    @Test
    public void checkEngine(){
        assertEquals("v6",car.getEngine());
    }

    @Test
    public void checkEngineHonda(){
        assertEquals("v4", hondaCar.getEngine());
    }

}
