package OOPS;

//Super Class
class Student{

    int register_no;

    void getNo(int no) {
        register_no = no;
    }

    void putNo(){

        System.out.println("registration number="+register_no);
    }


}

//sub class ---> derived class

class Marks extends Student{
    float marks;
    void getMarks(float m){

        marks=m;
    }
    void putmarks(){

        System.out.println("Marks="+marks);
    }

}

//derived class

class Sports extends Marks{

    float score;


    void getscore(float scr) {
        score=scr;

    }

    void putscore(){

        System.out.println("Score="+score);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Sports sports1=new Sports();
        sports1.getNo(2164);
        sports1.putNo();
        sports1.getMarks(84);
        sports1.putmarks();
        sports1.getscore(71);
        sports1.putscore();
    }
}
