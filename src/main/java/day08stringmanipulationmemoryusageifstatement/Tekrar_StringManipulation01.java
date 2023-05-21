package day08stringmanipulationmemoryusageifstatement;

public class Tekrar_StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum

        String a = "";
        System.out.println(a.length()<1);

        //2.yol tavsiye edilir "isEmpty" methodu
        System.out.println("isEmpty() methodu : " + a.isEmpty());

        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.


        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String b = "";

        //1. yol replace.length() == 0
        System.out.println(b.replace(" ","").length()<1);

        //2. yol isEmpty
        System.out.println(b.replace(" ","").isEmpty());

        //3. yol isBlank()
        System.out.println(b.isBlank());

        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index

        //                    11111111112
        //          012345678901234567890
        //           *   *  *
        String r = "Java is easy to learn";

        int index_a = r.indexOf('a');
        int index_i = r.indexOf('i');
        int index_e = r.indexOf('e');
        System.out.println(index_a+index_i+index_e);    //14

        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz

        //                    111111111122222222223333333
        //          0123456789012345678901234567890123456
        //             *
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        System.out.println(u.indexOf("Java"));              // 3
        System.out.println(u.indexOf("java"));              // -1 (yok demek)


        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder


        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.

        //                    11111111112
        //          012345678901234567890
        //               *           **
        String v = "Java is easy to learn";

        int last_a = v.lastIndexOf('a');        // 18
        int last_e = v.lastIndexOf('e');        // 17
        int last_i = v.lastIndexOf('i');        //  5
        int last_x = v.lastIndexOf('x');        // -1


        System.out.println(last_a+last_e+last_i);


        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.

    }
}