public class abstraction{
    public static void main(String []args){
      Car car = new FeulCar();
      car.start();
    }
}
abstract class Car{
    void start(){
        System.out.println("car started");
    }

    abstract void accelerate();

    abstract void brake();
}
class FeulCar extends Car{
    @Override 
    void accelerate(){
        System.out.println("feul car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("feul car is braking");
    }
}
class electricCar extends Car{
    @Override 
    void accelerate(){
        System.out.println("electric car is accelerating");
    }
    @Override 
    void brake(){
        System.out.print("electric car is stopping");
    }
}

