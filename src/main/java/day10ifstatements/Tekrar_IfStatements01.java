package day10ifstatements;

import java.util.Scanner;

public class Tekrar_IfStatements01 {
    public static void main(String[] args) {
        //Ornek: Verilen bir sayinin pozitif, negatif yada notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        Integer number = input.nextInt();

        if (number>0){
            System.out.println("Sayi pazitif");
        } else if (number<0) {
            System.out.println("Sayi negatif");
        } else {
            System.out.println("Sayi notr");}


        }
}