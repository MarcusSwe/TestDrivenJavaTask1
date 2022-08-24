public class CarFactory {

    public int createRegNr(){
      return CreateRegNR.createReg();
    }

     public Car create(String color){
        String brand = "volvo";
        String engine = "v6";
        return new Car(color, brand, createRegNr(), engine);
    };


}
