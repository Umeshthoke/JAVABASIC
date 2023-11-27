package OOPS;
interface Drawset {

    void draw();

    void write();
}
class Rectangle1 implements Drawset{

    public void draw(){

        System.out.println("drawing Rectangle");

    }
    public void write(){

        System.out.println("Writing Something About Rectangle");
    }
}
class Circle implements Drawset{
    public void draw(){

        System.out.println("Drawing Circle");
    }
    public void write(){

        System.out.println("Writing Something About Circle");
    }
}
public class Interface1 {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.draw();
        circle.write();

        Rectangle1 rectangle1=new Rectangle1();
        rectangle1.draw();
        rectangle1.write();

    }

}
