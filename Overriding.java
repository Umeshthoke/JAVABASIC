package OOPS;

class Bank {

     int  getRateOfInterest() {

        return 0;

    }
}

    class CanaraBank extends Bank {

       int getRateOfInterest() {

            return 6;
        }
    }

        class Sbi extends Bank {

            int getRateOfInterest() {

                return 5;
            }
        }

            class Axis extends Bank{


              int getRateOfInterest() {
                    return 8;

                }

            }

    class Overriding {

    public static void main(String[] args) {

        CanaraBank canara=new CanaraBank();
        Sbi sbi=new Sbi();
        Axis axis=new Axis();

        System.out.println("Rate Of Interest Of Canara Bank:" +canara.getRateOfInterest());
        System.out.println("Rate Of Interest Of Sbi:"+sbi.getRateOfInterest());
        System.out.println("Rate Of Interest Of Axis Bank:"+axis.getRateOfInterest());
    }
}
