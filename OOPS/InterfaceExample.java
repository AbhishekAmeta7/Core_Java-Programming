interface Animal{
    void sound();
    void move();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("the dog is barking");
    }
    public void move(){
        System.out.println("Dog is Running");
    }
} 
class Bird implements Animal{
    public void sound(){
        System.out.println("Birds are chirping");
    }
    public void move(){
        System.out.println("Bird is Running");
    }
} 
class Fish implements Animal{
    public void sound(){
        System.out.println("Fish......");
    }
    public void move(){
        System.out.println("Fish is Swimming");
    }
} 
public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.move();
        Animal bird = new Bird();
        bird.sound();
        bird.move();
        Animal fish = new Fish();
        fish.sound();
        fish.move();
    }
}
// 6. Create an interface `Animal` with methods `sound()` and `move()`. Implement 
// this interface in classes `Dog`, `Bird`, and `Fish`.
// Show how polymorphism can be used to call the `sound()` method on different animals.