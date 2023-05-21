package day06swapvaluesstringmanipulations;

public class Tekrar {
    public static void main(String[] args) {
        int a = 12 ;
        int b = 25 ;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a ;
        a = b ;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        int x = 4 ;
        int y = 6;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x+y ;
        y = x-y ;
        x = x-y ;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
