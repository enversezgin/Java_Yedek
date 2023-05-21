package day09ifstatements;

import java.util.Scanner;

public class Tekrar_IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Harf Giriniz");
        char chark = input.next().charAt(0);

        if (chark>='A' && chark<='Z'){
            System.out.println("Buyuk Harf");
        } else if ( chark >= 'a' && chark <= 'z' ) {

            System.out.println("Kucuk Harf");
        } else {
            System.out.println("Harf disi karakter");
        }


    }
}
