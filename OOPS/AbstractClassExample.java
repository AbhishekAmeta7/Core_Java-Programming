abstract class Vehicle{
    abstract void move();
}
class Car extends Vehicle{
    public void move(){
        System.out.println("The car is moving");
    }
}
class Bike extends Vehicle{
    public void move(){
        System.out.println("The Bike is moving");
    }
}
class Boat extends Vehicle{
    public void move(){
        System.out.println("The boat is floating");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        Vehicle bike = new Bike();
        bike.move();
        Vehicle boat = new Boat();
        boat.move();
    }
}
// 9.Design a `Vehicle` class with an abstract method `move()`. Extend it into subclasses 
// `Car`, `Bike`, and `Boat`. Override the `move()` method to define how each vehicle moves. 
// Demonstrate dynamic method dispatch using these classes.