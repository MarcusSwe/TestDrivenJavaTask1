import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BilFabrikTest {

    Car car;
    Car carNewBrand;
    CarFactory carFactory = new CarFactory();
    CarFactoryNewBrand newBrandCar = new CarFactoryNewBrand();

    @BeforeEach
    void setUp() {
        car = carFactory.create("blue");
        carNewBrand = newBrandCar.create("blue");
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
        assertEquals("honda", carNewBrand.getBrand());
    }

    @Test
    public void checkNewBrandCarColor(){
        assertEquals("blue", carNewBrand.getColor());
    }

    @Test
    public void checkEngine(){
        assertEquals("v6", car.getEngine());
    }

    @Test
    public void checkEngineNewBrand(){
        assertEquals("v4", carNewBrand.getEngine());
    }

}
