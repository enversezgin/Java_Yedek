package day03methodobjectcreationscanner;

import java.util.Scanner;

public class TekrarScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Adinizi Giriniz");
        String isim = input.nextLine();

        System.out.println("Lutfen Soyadinizi Giriniz");
        String soyisim = input.nextLine();

        System.out.println("Dogum Yilinizi Giriniz");
        short dogumYili = input.nextShort();

        System.out.println("Dogdugunuz Yeri Giriniz");
        String dogumYeri = input.next();

        System.out.println(dogumYeri+" "+dogumYili+" dogumlu "+"Sn. "+isim+" "+soyisim+" sisteme giris yapabilirsiniz...");







    }



}
