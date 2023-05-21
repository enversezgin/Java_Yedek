package day03methodobjectcreationscanner;

public class TekrarMethodCreation01 {
    public static void main(String[] args) {
        int kupHacmi = kup(5);
        System.out.println("kupHacmi = " + kupHacmi);

        yazdir("Ben bu işi basaracagim");
        yazdir2("Method ile Yazdirmayi Ogreniyorum.");

        String ikinciYol = "Daha Hizli Olmaya Ne Dersiniz?";
        hizliol(ikinciYol);

        int a = 8;
        int b = 7;
        carpmaYapalim(a,b);

    int sonuc = carpmayapar ( 9,5);
        System.out.println(sonuc);

        double sonuncu = birdaha(4,2,4,5);
        System.out.println(sonuncu);



    }

    private static void carpmaYapalim(int a, int b) {
        System.out.println(a*b);
    }

    private static void hizliol(String ikinciYol) {
        System.out.println(ikinciYol);
    }

    private static int kup (int aKenari){
        return (aKenari*aKenari*aKenari);
    }

    public static void yazdir (String metin){
        System.out.println(metin);
    }
    public static void yazdir2 (String metin){
        System.out.println(metin);
    }

    public static int carpmayapar(int x,int y){
        return x*y;}

    private static double birdaha (double a, double b, double c, double d){
        return a+b*c/d;
    }
}
