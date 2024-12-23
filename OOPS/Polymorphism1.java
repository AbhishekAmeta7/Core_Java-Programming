class Car{
    String model;
    int year;
    int price;
    Car(String model,int year,int price){
        this.model=model;
        this.year=year;
        this.price=price;
    }
    void carDetails(){

    }
}
class MarutiSuzuki extends Car{
    MarutiSuzuki(){
        super("Swift", 2014, 700000);
    }
    void carDetails(){
        System.out.println("<----Maruti Cars---->");
        System.out.println("Model: "+model+"\nYear: "+year+"\nPrice: "+price);
    }
}
class Tata extends Car{
    Tata(){
        super("Nexon",2020,800000);
    }
    void carDetails(){
        System.out.println("<----Tata Cars---->");
        System.out.println("Model: "+model+"\nYear: "+year+"\nPrice: "+price);
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Car maruti = new MarutiSuzuki();
        maruti.carDetails();
        Car tata = new Tata();
        tata.carDetails();
    }
}
// 2. Design a class `Car` with properties like `model`, `year`, and `price`. 
// Implement a method to compare two cars based on their price using method overriding.