package OOPS;

class shape{


    public int calculateArea(int length,int breadth){

        return length*breadth;
    }
}
        //Inheritance shape member using extend keyword

     class Rectangle extends shape{

         public static void main(String[] args) {
            Rectangle rectangle=new Rectangle();
             System.out.println("Area of Rectangle:"+rectangle.calculateArea(10,5));
         }
     }