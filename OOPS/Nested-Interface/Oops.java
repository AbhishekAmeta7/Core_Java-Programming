import java.util.Scanner;
class Shape {
    double calculatePerimeter(){
        return 0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculatePerimeter() {
        return (2*Math.PI*radius);
    }
}
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculatePerimeter() {
        return (2*(length + width));
    }
}

class Triangle extends Shape {
    private double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    double calculatePerimeter() {
        return (s1+s2+s3);
    }
}
public class Oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle: ");
        double r = sc.nextDouble();
        System.out.println("Enter Length and Breadth of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter Sides Length Of Triangle: ");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        Shape circle = new Circle(r); 
        Shape rectangle = new Rectangle(l, b); 
        Shape triangle = new Triangle(a1,a2,a3); 

        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
    }
}
