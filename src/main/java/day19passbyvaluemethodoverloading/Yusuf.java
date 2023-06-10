package day19passbyvaluemethodoverloading;

public class Yusuf {
    public static void main(String[] args) {

    alan(5,3);


    }

    public static void alan (int a ){
        System.out.println(a * a);
    }

    public static void alan (int a,int b){
        System.out.println(a * b);

    }
    public static void alan (double a,int h){
        System.out.println(a * h / 2);
    }
}
