package OOPS;

class Method{

    String Student_name;
    int Roll_number;

    //Function1

    //Method Overloading

    public void displayInfo(String Student_name){

        System.out.println(Student_name);
    }

    //Function2
    public void displayInfo(int Roll_number){

        System.out.println(Roll_number);
    }
    //Function3

    public void displayInfo(String Student_name,int Roll_number){

        System.out.println(Student_name);
        System.out.println(Roll_number);
    }

}

public class Overloading {
    public static void main(String[] args) {


        Method m1=new Method();
        m1.Student_name="Rushikesh";
        m1.Roll_number=30;

        m1.displayInfo(m1.Roll_number);
        m1.displayInfo(m1.Student_name,m1.Roll_number);
    }
}
