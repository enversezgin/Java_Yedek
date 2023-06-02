package day07stringmanipulations;

import java.util.Scanner;

public class Tekrar_SM02 {
    public static void main(String[] args) {
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen sartlari saglayan bir password giriniz");

        String password = input.nextLine();

        //  1) En az 8 character olsun

        boolean sart1 = password.length()>7;
        System.out.println("sart1 = " + sart1);

        // 2) Space characteri passwordde olmasin

        boolean sart2 = !password.contains(" ");
        System.out.println("sart2 = " + sart2);

        //3) En az bir buyuk harf olsun
        //Note:Buyuk harf olmayanlari sil
        //     kalan character sayisina bak
        //     character sayisi sifir ise buyuk harf yok demektir
        //      sifirdan buyuk ise buyuk harf var demektir

        boolean sart3 = password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("sart3 = " + sart3);

        //4)  4) En az bir kucuk harf olsun

        boolean sart4 = password.replaceAll("[^a-z]","").length()>0;
        System.out.println("sart4 = " + sart4);

        //  5) En az bir rakam olsun

        boolean sart5 = password.replaceAll("[^0-9]","").length()>0;
        System.out.println("sart5 = " + sart5);

        System.out.println("Tum sartlar saglaniyor mu? "+(sart1&&sart2&&sart3&&sart4&&sart5));



    }
}