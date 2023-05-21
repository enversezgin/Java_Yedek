package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar_Scanner03 {
    public static void main(String[] args) {
        Scanner sayi1 = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
        double sayi01 = sayi1.nextDouble();

        Scanner sayi2 = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz ikinci sayiyi giriniz");
        double sayi02 = sayi2.nextDouble();

        System.out.println(sayi01 + sayi02);
        System.out.println(sayi01 - sayi02);
        System.out.println(sayi01 * sayi02);
        System.out.println(sayi01 / sayi02);
        //merhaba  baba :)



    }
}
