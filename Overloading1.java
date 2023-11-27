package OOPS;




class Umesh1{
    int num1,num2;

    public int add(int num1,int num2){

        int add=num1+num2;
        return add;
    }


}

public class Overloading1 {

    public static void main(String[] args) {
        Umesh1 obj=new Umesh1();
       obj.num1=11;
       obj.num2=12;

        int add = obj.add(11,12);

        System.out.println("Addition Of The :" + add);
    }
}
