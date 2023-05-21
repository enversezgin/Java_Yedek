package day03methodobjectcreationscanner;

public class Car {
    //Variable'lar olusturulur.
    public String model = "Tesla";
    public int fiyat = 20000;

    //Method lari olusturalim.
    //Note: retunt type void old. mothod icinde "retun" keywordu kullanilmaz.
    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder...");
    }
    public void dur (){
        System.out.println("Tesla guvenli bir sekilde durur..");
    }
}

