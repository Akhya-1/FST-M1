package activities;

public class Activity1 {

    public static void main(String[] args )
    {
        Car carName= new Car();
        carName.make=2014;
        carName.color="Black";
        carName.transmission="Manual";
        carName.displaycharacteristics();
        carName.accelerate();
        carName.brake();


    }
}
