package day11nestedifternaryincrementdecrement;

public class Terar_Ternary02 {
    public static void main(String[] args) {

        //Ornek 1
        int a = 20;
        int b = 10;

        int r1 = b < a ? a++ : ++b;     //a:10 b:20  icin // a:20 b:10  icin

        System.out.println(r1);         //    21          //    20
        System.out.println(a);          //    10          //    21
        System.out.println(b);          //    21          //    10

        //Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //         -4 ==>  -1*-4     4==>4       0==>0
        int c = -4;


        //Ornek 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // " farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int m = 5;
        int n = 6;


        //"Object" java da butun "Non-Primitive Data Type"(Class) larinin ortak "Parent"(baba-anne) idir.
        //"Object" in Parenti yoktur
        //Farkli data type lar icin ortak bir variable olusturmak istediginizde, data type olarak object
        // kullanabilirsiniz
        //Java da "Object", insanlik aleminde "Hz. Adem'e benzer"

        //Ornek 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -315;

    }
}