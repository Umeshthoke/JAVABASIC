package OOPS;

public class Diamond {

    public static void Dia(int n){

        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){

                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){

            for(int j=n;j>=i;j--){

                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Parellelogram(int row,int column){

        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){

                System.out.print(" ");
            }

            for(int j=1;j<=column;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Diamond1(int n){

        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){

                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){

            for(int j=n;j>=i;j--){

                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Diamond1(5);
    }
}
