public class CarFactoryNewBrand extends CarFactory{

    @Override
    public Car create(String color){
        String brand = "honda";
        return new Car(color, brand, createRegNr());
    };

}
