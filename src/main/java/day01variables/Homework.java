package day01variables;

public class Homework {

    public static void main (String[]args){
        //  Soru:1 Uc farkli data tipinde variable olusturun ve bunları yazdiniz

        // 1)
        String adres =  "Sahinler Cad.No:15 Nilufer / BURSA" ;
        System.out.println(adres);

        // 2)
        boolean evliMisiniz = true;
        System.out.println(evliMisiniz);

        // 3)
        byte yaziliSinavNotu1 = 95;
        System.out.println(yaziliSinavNotu1);

        // Soru2 : ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin

        String sehirAdi = "Bursa";
        System.out.println("Sehir Adi: "+sehirAdi);
        String ulkeAdi = "Turkiye";
        System.out.println("Ulke Adi: "+ulkeAdi);

        // Soru3 iki tamsayi turunde variable olusturup toplamini yazdirin.

        byte balkonAlani1 = 42;
        byte balkonAlani2 = 35;
        System.out.println("Evin Toplam Balkon Alanı : " + (balkonAlani1+balkonAlani2) + " m2");

    }

}
