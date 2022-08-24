import java.util.Random;

public class CreateRegNR {

    static int createReg(){
        Random rand = new Random();
        return rand.nextInt(100000);
    }

}
