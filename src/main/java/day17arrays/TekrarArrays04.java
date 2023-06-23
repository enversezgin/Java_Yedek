package day17arrays;

import java.util.Arrays;

public class TekrarArrays04 {
    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";
        String [] kelime = s.split(" ");
        System.out.println(Arrays.toString(kelime));
        System.out.println(kelime.length);


        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.

        String s1 = s.replaceAll("[^A-Za-z]","");
        String [] s2 = s1.split("");
        System.out.println(Arrays.toString(s2));
        System.out.println(s2.length);


    }
}