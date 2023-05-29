package day13loops;

public class Tekrar_Loops02 {

    public static void main(String[] args) {
        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz

        for (int a = 21 ; a<180 ; a++){
            if ( a%2==0 && a%3==0 ){
                System.out.print(a + "-");
            }
        }
        System.out.println();

        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe
        // donusturen kodu yaziniz
        //      ankara  ==> AKR
        String s = "afyonkarahisar";

        for (int i=0 ; i<s.length() ;i++){
            String karakter = s.substring(i,i+1);
            if (i%2==0){
                System.out.print(karakter.toUpperCase()+"-");
            }
        }

        System.out.println();

        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s1 = "Enver Sezgin";

        for (int i = 0 ; i<s1.length();i++){
            char karakters1 = s1.charAt(i);
            if (karakters1 == 'a') {
                break;
            } else System.out.print(karakters1);
        }

        System.out.println();

        //Ornek 4: Verilen bir string te son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //  "Germany"  ==>  yn

        String t ="Germany";
        for ( int i = t.length()-1; i>=0 ; i-- ){
            System.out.print(t.charAt(i));

        }




    }
}