package OOPS;



class One {

    public void displayInfo() {

        System.out.println("Umesh");
    }
}

    class Two extends One{

        public void printInfo(){

            System.out.println("Thoke");

        }

        public static void main(String[] args) {


            Two two=new Two();

            two.displayInfo();
            two.printInfo();
            two.displayInfo();


        }



    }










