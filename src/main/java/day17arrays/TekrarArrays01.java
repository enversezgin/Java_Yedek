package day17arrays;

import java.util.Arrays;

public class TekrarArrays01 {
    public static void main(String[] args) {

        int rakamlar [] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(rakamlar));

        int sayac = 0;
        for (int w:rakamlar) {
        if (w%2==0){
            sayac++;
        }
        }
        System.out.println(sayac);

        String ogrenciAdi [] = {"Orhan","Ahmet","Taha","Alper","Enver","Sinem"};
        System.out.println(Arrays.toString(ogrenciAdi));

        for (String w : ogrenciAdi)
        if(w.length()>4){
            System.out.println(w);
        }

        Arrays.sort(ogrenciAdi);
        System.out.println(Arrays.toString(ogrenciAdi));

        for (String w : ogrenciAdi){
            if (w.charAt(0)=='M'){
                continue;
            }
            System.out.println(w);
        }
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz

        String s = "Java is easy. Learn Java earn money.";
        String words [] = s.split(" ");
        System.out.println(words.length);

        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.

        //[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]

        String letters [] = s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);


    }
}
