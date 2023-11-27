package OOPS;

class Employee{
    public void salary(){
        System.out.println("Salary:60000");

    }
}

class Programmer extends Employee{

    public void bonus(){

        System.out.println("Bonus:30000");
    }
}

public class inheritance2 {
    public static void main(String[] args) {

        Programmer p=new Programmer();

        p.salary();
        p.bonus();
    }
}
