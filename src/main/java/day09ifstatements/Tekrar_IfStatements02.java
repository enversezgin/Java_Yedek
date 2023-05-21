package day09ifstatements;

import java.util.Scanner;

public class Tekrar_IfStatements02 {
    public static void main(String[] args) {

        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu
        // olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("Cift Sayi");
        }else {
            System.out.println("Tek Sayi");
        }

    }
}