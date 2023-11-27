package OOPS;
class Dog{

    public void dog1(){

        System.out.println("barking");
      }
  }
      class Cat extends Dog{

                 public void cat1(){

                   System.out.println("meo.....meo");
             }

          }

          class Horse extends Dog{

            public void horse1(){

                System.out.println("Faster");
            }
          }
public class hierarchical_inheritance {
    public static void main(String[] args) {


              Cat cat=new Cat();
              Horse horse=new Horse();
              Dog dog=new Dog();

              dog.dog1();
              cat.cat1();
              horse.horse1();
    }
}
