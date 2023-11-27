package OOPS;

class Variable{

    String name;
    int salary;


    public void printStatement(){

        System.out.println(this.name);
        System.out.println(this.salary);




    }

    //Constructor

    Variable (String name,int salary){

        this.name=name;
        this.salary=salary;
    }

}
public class Constructor {
    public static void main(String[] args) {

        Variable v1=new Variable("Shivam",45000);


        v1.printStatement();

    }




}
