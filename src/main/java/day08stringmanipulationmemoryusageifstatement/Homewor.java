package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homewor {
    public static void main(String[] args) {




//    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin
//    sayisini console a yazdiriniz

        String a = "Java ilk olarak 1995 yilinda piyasaya sunuldu";
        String rakam = a.replaceAll("[0-9]",""); //rakam = Java ilk olarak  yilinda piyasaya sunuldu
        int sayi = rakam.length();                                //41
        System.out.println(sayi);


//    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a
//    buyuk harflerle yazdiriniz

        int uzunluk = a.length();       //45
        String ilkSonHarfKirp = a.substring(1,uzunluk-1).toUpperCase(); // AVA İLK OLARAK 1995 YİLİNDA PİYASAYA SUNULD
        System.out.println(ilkSonHarfKirp);

//    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin
//    ASCII degerleri toplamini console a yazdiriniz
        int ilkAscii = a.charAt(0);
        int sonAscii = a.charAt(41);
        System.out.println(+ilkAscii+sonAscii);

//    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle
//    diger harflerini kucuk harflerle console a yazdirin

        String sehir = "iSTanBul";
        String sehirDuzenle = sehir.toUpperCase().charAt(0) + sehir.toLowerCase().substring(1);
        System.out.println(sehirDuzenle);

  /*Homework
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sifrenizi Giriniz : ");
        String sifre = input.nextLine();
        boolean sifre1 = sifre.length() > 5;
        boolean sifre2 = sifre.replaceAll("[^A-Z]","").length()>0;
        boolean sifre3 = sifre.replaceAll("[^a-z]", "").length()>0;
        boolean sifre4 = sifre.replaceAll("[^0-9]", "").length()>0;
        System.out.println("Sifre Sartlari Sagliyor mu? : " + (sifre1&&sifre2&&sifre3&&sifre4));
    }
}