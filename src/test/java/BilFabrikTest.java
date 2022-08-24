import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BilFabrikTest {

    @Test
    public void getCarColorTest(){

        Car car = CarFactory.create("blue");

        assertEquals("blue", car.getColor());

    }

}
