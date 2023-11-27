package OOPS;


class Pen{

    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class oops {

    public static void main(String[] args) {


        Pen pen1 = new Pen();
        pen1.color = "Yellow";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpen";

        pen1.printColor();
        pen2.printColor();


    }
}