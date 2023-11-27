package OOPS;


class Umesh2{

    int a,b,c;

    public int product(int a,int b,int c){

        int product= a * b *  c;
        return product;
    }
}

public class Overloading2 {
    public static void main(String[] args) {

        Umesh2 obj1=new Umesh2();
        obj1.a=11;
        obj1.b=12;
        obj1.c=13;

        int product= obj1.product(11,12,13);
        System.out.println("Product of the Integers:"+product);
    }
}
