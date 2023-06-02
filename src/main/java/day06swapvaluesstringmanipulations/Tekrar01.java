package day06swapvaluesstringmanipulations;

public class Tekrar01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir.

        //                    11
        //          012345678901
        String s = "Java is easy";

        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.

        String buyukHarfli = s.toUpperCase();
        System.out.println("buyukHarfli = " + buyukHarfli);

        //Ornek 2: "s" String indeki tum characterleri kucuk harf yapiniz.

        String kucukHarfli = s.toLowerCase();
        System.out.println("kucukHarfli = " + kucukHarfli);

        //Ornek 3: "s" String indeki ilk characteri aliniz

        char ilkHarf = s.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        //Ornek 4: "s"  Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazidiriniz

        char ikinciHarf = s.charAt(1);
        String sondanIkinci = s.substring(s.length()-2,s.length()-1);
        System.out.println(ilkHarf + sondanIkinci);

        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz

        int metinUzunlugu = s.length();
        System.out.println("metinUzunlugu = " + metinUzunlugu + " karakterdir");

        //Ornek 6: "s" Stringindeki ilk dort characteri aliniz
        //substring(0,4) ==>  ilk index dahil,  ikinci index dahil degil

        String ilkDortHarf = s.substring(0,4);
        System.out.println(ilkDortHarf);

        //                    1
        //          01234567890123456
        //          Java is easy


        //Ornek 7: "s" Stringindeki "is" kelimesini aliniz

        String is = s.substring(5,7);
        System.out.println("is = " + is);

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz

        String easy1 =s.substring(8,12);
        System.out.println(easy1);

        //ikinci yol
        //Bir character den baslayip String in sonuna kadar almak isterseniz, ikinci indexi yazmayiniz
        //substring(8,12); yerine substring(8); yazdik boylece baslangic indexinden itibaren sonuna kadar aldik

        String easy2 = s.substring(8);
        System.out.println(easy2);

        //Ornek 9: "s" String inde "money" kelimesinin var olup olmadigini kontrol ediniz

        boolean moneyVarMi = s.contains("money");
        System.out.println(moneyVarMi);

        //Ornek 10: "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean ileBasliyorMu = s.startsWith("J");
        System.out.println(ileBasliyorMu);

        //Ornek 11:  "s" String inin 6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        //soru : 5. index dahil olmak uzere i karakteri ile baslayip baslamadigini kontorl eden kodu yaziniz

        boolean ileDevamEdiyorMu = s.startsWith("i",5);
        System.out.println(ileDevamEdiyorMu);


        String t = "Learn Java earn money";


        //Ornek 1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz.

        System.out.println(" " + s.endsWith("money"));

        //Ornek 2:"s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String dollar = t.replaceAll("money", "dollar");
        System.out.println(dollar); // Learn Java earn dollar

        //Ornek 3: "s" String indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String win = t.replaceAll("earn", "win");
        System.out.println(win); // Lwin Java win money
        System.out.println(t.replaceAll(" earn ", " win ")); // Learn Java win money

        //Ornek 4:  "s" String indeki "a" harflerini "*" sembolune ceviriniz.

        String ileDegistir = t.replace('a','*');
        System.out.println(ileDegistir); //Le*rn J*v* e*rn money

        //Note: replace () methodunda coklu character ler icin calisirsaniz mecbur cift tirnak kullanmaliyiz
        //Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        //Ya  ikisi de cift tirnak olmalidir yada ikiside tek tirnak olmalidir

        //Ornek 5: "s" String indeki "n" harflerini "XXX" e ceviriniz.

        System.out.println(t.replaceAll("n","**")); //Lear** Java ear** mo**ey


        //Ornek 6: "s" String indeki tum "e" harflerini siliniz

        System.out.println(t.replaceAll("e", "")); //Larn Java arn mony

        String v = "Ali 13 yasindadir!...";

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanir.
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Ornek 7:"v" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz

        /*
                     Meshur Regex ler
           1) Tum rakamlar               ==> [0-9]
           2) Tum kucuk harfler          ==> [a-z]
           3) Tum buyuk harfler          ==> [A-Z]
           4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
           5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
           6) Tum noktalama isaretleri   ==> \\p{Punct}
           7) Tum sesli Harfler          ==> [aeiouAEIOU]
           8) Tum x,q,w harfleri         ==> [xqw]
           9) Kucuk harflerden farkli tum characterler => [^a-z]
           10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
         */

        String rakamSil = v.replaceAll("[0-9]","*");
        System.out.println(rakamSil); // Ali ** yasindadir!...





    }
}
