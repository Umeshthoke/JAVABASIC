package OOPS;


class Var{

    String Name;
    int age;

    public void printStatement(){

        System.out.println(this.Name);
        System.out.println(this.age);

    }

       Var(String name, int age){

       this.Name=name;
        this.age=age;

    } 
}

public class Parameterized {

    public static void main(String[] args) {
        Var s1=new Var("Umesh",21);

        s1.printStatement();
    }
}
