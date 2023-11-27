package OOPS;



class Shape{

    public void Area(){


        System.out.println("Display Area");

    }
}

class Triangle extends Shape {

    public void Area(int base, int height) {

        System.out.println(1 / 2 * base * height);
    }
}
public class Single_inheritance {

    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        triangle.Area(3,5);
        triangle.Area();
    }
}
