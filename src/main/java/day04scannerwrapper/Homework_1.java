package day04scannerwrapper;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {

        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

        Scanner girdi = new Scanner(System.in);
        System.out.println("Lutfen Ortalamasinin Hesaplanmasini istediginiz 3 Ad. Sayi Giriniz");

        double sayi1 = girdi.nextDouble();
        double sayi2 = girdi.nextDouble();
        double sayi3 = girdi.nextDouble();

        System.out.println("Girilen 3 sayinin ortalamasi :");
        System.out.println((sayi1+sayi2+sayi3)/3);




    }
}
