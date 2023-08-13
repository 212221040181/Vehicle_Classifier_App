// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        car.start();
        motorcycle.start();
        car.stop();
        motorcycle.stop();
    }
}
class Vehicle
{
    void start()
    {

    }
    void stop()
    {

    }
}
class Car extends Vehicle
{
    @Override
    void start() {
        System.out.println("car started");
    }

    @Override
    void stop() {
        System.out.println("car stopped");
    }
}
class Motorcycle extends Vehicle
{
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped.");
    }
}