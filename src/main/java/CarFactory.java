public class CarFactory {

    private String getBrand(){
        return "volvo";
    }
    private String getEngine(){
        return "v6";
    }

    public int createRegNr(){
      return CreateRegNR.createReg();
    }

     public Car create(String color){
        return new Car(color, getBrand(), createRegNr(), getEngine());
    }

}
