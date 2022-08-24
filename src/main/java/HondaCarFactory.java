public class HondaCarFactory extends CarFactory{

    private String getBrand(){
        return "honda";
    }
    private String getEngine(){
        return "v4";
    }

    @Override
    public Car create(String color){
        return new Car(color, getBrand(), createRegNr(), getEngine());
    };

}
