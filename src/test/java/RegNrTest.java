import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegNrTest {

    @Test
    public void checkRegNrRange(){
        int regnr = CreateRegNR.createReg();
        assertTrue(regnr <100001 && regnr > -1);
    }

}
