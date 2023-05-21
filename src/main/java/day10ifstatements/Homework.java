package day10ifstatements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

    //Homework
    // 1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup
    // olmadigini kontrol eden ve kullaniciya uygun mesaj veren kodu yaziniz

        System.out.println("/-/-/-/-/-/-/ 1. Odev /-/-/-/-/-/-/");


    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your Password");
    String pwd = input.nextLine();

    if (pwd.equals("pwd123!")){
        System.out.println("Password is true");
    } else {
        System.out.println("Password is not true, Please try again");
    }

        System.out.println("/-/-/-/-/-/-/ 2. Odev /-/-/-/-/-/-/");
    // 2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    // Pazar ==> 1. gun , Pazartes ==> 2. gun...

    Scanner inputDay = new Scanner(System.in);
    System.out.println("Bir Gun Adi Giriniz");
    String nameOfDay = inputDay.nextLine();

        if (nameOfDay.equalsIgnoreCase("Pazartesi")) {
            System.out.println("1.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Sali")) {
            System.out.println("2.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Carsamba")) {
            System.out.println("3.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Persembe")) {
            System.out.println("4.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Cuma")) {
            System.out.println("5.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Cumartesi")) {
            System.out.println("6.Gun");
        } else if (nameOfDay.equalsIgnoreCase("Pazar")) {
            System.out.println("7.Gun");
        } else {
            System.out.println("Dogru gun adi girdiginizden emin olunuz");
        }

        System.out.println("/-/-/-/-/-/-/ 3. Odev /-/-/-/-/-/-/");

    // 3) Ay sayisini verdiginizde ay ismini veren kodu yaziniz
    //     1==>January , 2==> February

    Scanner inputMaunth = new Scanner(System.in);
    System.out.println("Yilin kacinci ayinin adini ogrenmek istersiniz?");
    String numOfMaunth = inputMaunth.next();

    if (numOfMaunth.equals("1")){
        System.out.println("January");
    } else if (numOfMaunth.equals("2")){
        System.out.println("February");
    } else if (numOfMaunth.equals("3")){
        System.out.println("March");
    }else if (numOfMaunth.equals("4")){
        System.out.println("April");
    }else if (numOfMaunth.equals("5")){
        System.out.println("May");
    }else if (numOfMaunth.equals("6")){
        System.out.println("June");
    }else if (numOfMaunth.equals("7")){
        System.out.println("July");
    }else if (numOfMaunth.equals("8")){
        System.out.println("August");
    }else if (numOfMaunth.equals("9")){
        System.out.println("September");
    }else if (numOfMaunth.equals("10")){
        System.out.println("October");
    }else if (numOfMaunth.equals("11")){
        System.out.println("November");
    }else if (numOfMaunth.equals("12")){
        System.out.println("December");
    }else {
        System.out.println("Girdiginiz numarayi kontrol ediniz");
    }

        System.out.println("/-/-/-/-/-/-/ Odev Tamamlandi /-/-/-/-/-/-/");

    }
}