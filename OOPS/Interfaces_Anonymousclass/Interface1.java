interface A{
    static String sayHello(String name){//static method in interface
        return name;
    }
    void greet();
    default int age(int a){//default method in iterface
        return a;
    }
}
class B implements A{
    public void greet(){
        System.out.println("Good Morning!....");
    }
}
public class Interface1{
    public static void main(String[] args){
        A obj = new B();
        System.out.print("Hello "+A.sayHello("John "));
        obj.greet();
        System.out.println("Your age is: "+obj.age(20));
        
    }
}
