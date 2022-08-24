import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
    public void checkCarRegNrBelowSevenFigures(){
        assertTrue(car.getRegnr() < 100001);
    }

    @Test
    public void checkCarRegNrAboveZero(){
        assertTrue(car.getRegnr() > -1);
    }

    @Test
    public void checkNewBrand(){
        assertEquals("honda", carNewBrand.getBrand());
    }

    @Test
    public void checkNewBrandCarColor(){
        assertEquals("blue", carNewBrand.getColor());
    }

    @Test
    public void checkNewBrandCarRegNrShouldFailJustToShowIfRegNrWorks(){
        assertEquals(999999999, carNewBrand.getRegnr());
    }

}
