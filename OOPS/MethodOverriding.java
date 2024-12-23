import java.util.*;
class Shape{
    double area(){
        return 0;
    }
}
class Circle extends Shape{
    private int r;
    Circle(int r){
        this.r=r;
    }
    public double area(){
        return (Math.PI*r*r);
    }
}
class Rectangle extends Shape{
    private int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return (l*b);
    }
}
class Triangle extends Shape{
    private int b,h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return (0.5*b*h);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println("Area Of Circle: "+circle.area());
        Shape rect = new Rectangle(5,3);
        System.out.println("Area Of Rectangle: "+rect.area());
        Shape tri = new Triangle(3, 4);
        System.out.println("Area Of Triangle: "+tri.area());
    }
}
