package OOPS;

interface Animal1 {

    int eyes = 2;

    void walk();
}

    interface Herbivore{


    }
    class Cat1 implements Animal1,Herbivore{

        public void walk(){

            System.out.println("Cat walks on 4 legs");
        }


    }


public class Interface {

    public static void main(String[] args) {
        Cat1 cat=new Cat1();
        cat.walk();
    }


}
