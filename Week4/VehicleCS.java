package Week4;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Starting the car");
    }
    @Override
    void stop(){
        System.out.println("Stopping the car");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Starting the bike");
    }
    @Override
    void stop(){
        System.out.println("Stopping the bike");
    }
}

public class VehicleCS {
    public static void main(String[]args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
