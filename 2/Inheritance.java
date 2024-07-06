class Vehicle {

    int noofPassanger;
    int maxSpeed;

    public void display1() {
    System.out.println("Passangers = " + noofPassanger);
    System.out.println("Max Speed = " + maxSpeed);
    }
    
    }
    
    class Car extends Vehicle {
    double horsePower;
    int noofAirbags;
    public void display2() 
    {
    System.out.println("Passangers = " + noofPassanger);
    System.out.println("Max Speed = " + maxSpeed);
    System.out.println("Hourse Power = " + horsePower);
    System.out.println("Airbags = " + noofAirbags);
    
    }
}
public class Inheritance {

    public static void main(String ar[]) {
        
    Vehicle v = new Vehicle();
    v.maxSpeed = 80;
    v.noofPassanger = 2;
    System.out.println("Vehicle ");
    v.display1();
        
    Car c = new Car();
    
    c.maxSpeed = 200;
    c.noofPassanger = 5;
    c.horsePower = 1.2;
    c.noofAirbags = 2;
    System.out.println("Car");
    c.display2();
    }
}

    
