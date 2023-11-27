package OOPS;

abstract class Animal {

    abstract void walk();



    void breathe() {

        System.out.println("This Animal Breadth Air");
    }

    Animal() {

        System.out.println("You are about to create an animal");
    }


    }

    class Horse1 extends Animal {


        Horse1() {

            System.out.println("WOW, You Are Creating Horse");

        }

        void walk() {

            System.out.println("Horse Walk on 4 legs ");

        }


    }

    class Chicken extends Animal{

        Chicken(){

            System.out.println("You are creating Chicken");
        }

        void walk() {

            System.out.println("Chicken walk on 2 legs");

        }
    }

    public class Abstract {

    public static void main(String[] args) {

        Horse1 horse=new Horse1();

        horse.walk();
        horse.breathe();



    }
  }
