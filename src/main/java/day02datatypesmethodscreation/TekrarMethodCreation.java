package day02datatypesmethodscreation;

public class TekrarMethodCreation {
    public static void main(String[] args) {
        int toplamaSonucu = toplamaYap(4,5);
        System.out.println("toplamaSonucu = " + toplamaSonucu);

        double dikdortgenAlani = alanHesapla(9,7);
        System.out.println("dikdortgenAlani = " + dikdortgenAlani);

        double dikdortgenCevresi = cevreHesapla(3,5);
        System.out.println("dikdortgenCevresi = " + dikdortgenCevresi);
    }

    public static int toplamaYap (int sayia,int sayib){
        return (sayia+sayib);
    }

    protected static double alanHesapla (double aKenari, double bKenari){
        return (aKenari*bKenari);
    }
    public static double cevreHesapla (double aKenari, double bKenari){
        return ((aKenari+bKenari)*2);
    }
}
