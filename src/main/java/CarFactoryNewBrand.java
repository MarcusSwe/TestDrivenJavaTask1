public class CarFactoryNewBrand extends CarFactory{

    @Override
    public Car create(String color){
        String brand = "honda";
        String engine = "v4";
        return new Car(color, brand, createRegNr(), engine);
    };

}
