package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar_Scanner05 {
    //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve
    // son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz

    //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
    // % ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
    //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
    //java yuvarlama yapmaz, ondalikli kismi iptal eder
    //dolayisiyle bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz

//homework
//1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
//ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

//2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
// ornegin => 312 icin 3+1+2=6

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamali bir sayi giriniz");
        int number = input.nextInt();

        int birler = number % 10 ;
        number = number / 10;               // 4 basamali kaldi

        int onlar = number % 10 ;
        number = number / 10 ;              // 3 basamali kaldi

        int yuzler = number % 10 ;
        number = number / 10;               // 2 basamali kaldi

        int binler = number % 10 ;
        number = number / 10 ;              // 1 basamak kaldi

        int onbinler = number % 10 ;
        number = number / 10 ;              // bitti

        System.out.println("bes basamakli sayinizin rakamlari toplami:");
        System.out.println(birler+onlar+yuzler+binler+onbinler);
    }

}