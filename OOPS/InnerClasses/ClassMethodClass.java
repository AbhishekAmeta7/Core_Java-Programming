class A{
    void show1(){
        System.out.println("show1 in class A"); 
        class B{
            void show2(){
                System.out.println("show2 in class B");
            }
        }
        B b = new B();
        b.show2();
    }
}
public class ClassMethodClass{
    public static void main(String[] args) {
        A a = new A();
        a.show1();
    }   
}