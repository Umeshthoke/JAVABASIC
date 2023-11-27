package OOPS;


class Name{


    String name;
    int Age;



    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.Age);


    }
}

public class Object1 {

    public static void main(String[] args) {

       Name student1=new Name();
       student1.name= "Umesh";
       student1.Age=21;

       student1.printInfo();

    }
}
