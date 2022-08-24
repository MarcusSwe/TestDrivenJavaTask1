import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BilFabrikTest {

    @Test
    public void getCarColorTest(){
        Car car = CarFactory.create("blue");
        assertEquals("blue", car.getColor());
    }

    @Test
    public void getCarBrandTest(){
        Car car = CarFactory.create("blue");
        assertEquals("volvo", car.getBrand());
    }

    @Test
    public void checkCarRegNrBelowSevenFigures(){
        Car car = CarFactory.create("blue");
        assertTrue(car.getRegnr() < 100000);
    }

    @Test
    public void checkCarRegNrAboveZero(){
        Car car = CarFactory.create("blue");
        assertTrue(car.getRegnr() > -1);
    }

}
