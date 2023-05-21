package day10ifstatements;

import java.util.Scanner;

public class Tekrar_NestedIf01 {
    public static void main(String[] args) {
    /*  Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */
    Scanner input = new Scanner(System.in);
    System.out.println("Ucgenin herbir kenar uzunlugunu sirasiyla giriniz ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    boolean ucgenMi = (a+c>b && b> Math.abs(a-c) &&
                       a+b>c && c> Math.abs(a-b) &&
                       b+c>a && a> Math.abs(b-c) );

    if (ucgenMi){
        if (Math.abs(a)==Math.abs(b) && Math.abs(a)==Math.abs(c)){
            System.out.println("Eskenar Ucgen");
        } else {System.out.println("Ucgen Eskenar Degil");
            }
    } else {System.out.println("Girilen degerler ucgen olusturmuyor");
        }


    }
}