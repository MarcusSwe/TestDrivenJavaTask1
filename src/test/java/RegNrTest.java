import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegNrTest {

    int regnr = CreateRegNR.createReg();

    @Test
    public void checkRegNrRange(){
        assertTrue(regnr <100001 && regnr > -1);
    }

}
