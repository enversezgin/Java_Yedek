package day07stringmanipulations;
public class Tekrar_SM03 {

    public static void main(String[] args) {
        //Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        //  "    Ali Can    " ==> "Ali Can"
        String s = "    Ali Can    ";
        System.out.println(s);

        //trim() method'u bir string in bas ve sonundaki space characterlerini siler, aradaki space'lere dokunmaz

        System.out.println(s.trim());

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //  String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv = "$465.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);

        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);

        double total = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("total = " + total);


        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "   Ali Can    " ==> AC
        String name = "   ali cAN    ";
        //split() methodu bir string i istedigimiz karakterden parcalamaya yarar

        String buyukHarfIsim = name.trim().toUpperCase();
        System.out.println("buyukHarf = " + buyukHarfIsim);

        char ilkIsimIlkHarf = buyukHarfIsim.split(" ")[0].charAt(0);
        System.out.println(ilkIsimIlkHarf);
        char ikinciIsimIlkHarf = buyukHarfIsim.split(" ")[1].charAt(0);
        System.out.println(ikinciIsimIlkHarf);

        System.out.println(ilkIsimIlkHarf + " " + ikinciIsimIlkHarf);


    }
}