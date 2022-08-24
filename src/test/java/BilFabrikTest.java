import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BilFabrikTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = CarFactory.create("blue");
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

}
