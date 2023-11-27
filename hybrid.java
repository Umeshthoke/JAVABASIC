package OOPS;

class Grandfather{

    public void show(){

        System.out.println("I am The Grand Father");
    }
}
class Father extends Grandfather{


    public void show() {
        System.out.println("I am Father");
    }
}

class Son extends Father{

    public void show(){

        System.out.println("I am your Son");
    }
}

class Daughter extends Father{
    
    public void show(){

        System.out.println("I am your daughter");
    }
}


public class hybrid {

    public static void main(String[] args) {
        Daughter daughter=new Daughter();
        daughter.show();

    }
}
