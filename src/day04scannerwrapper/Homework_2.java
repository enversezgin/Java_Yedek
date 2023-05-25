package day04scannerwrapper;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {


        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner ucBasamakliSayi = new Scanner(System.in);
        System.out.println("Uc Basamakli Bir Sayi Giriniz");
        int sayi = ucBasamakliSayi.nextByte();

        int birler = sayi % 10;
        sayi = sayi/10;                // 2 basamak kaldi

        int onlar = sayi % 10;
        sayi = sayi/10;                         // 1 basamak kaldi

        int yuzler = sayi % 10;

        System.out.println("Girilen Sayinin Rakamlar Toplami :");
        System.out.println(birler+onlar+yuzler);




    }
}
