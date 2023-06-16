package day02datatypesmethodscreation;

public class Homework {
    /*
1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
*/
    public static void main(String[] args) {
        int alan = dikdortgenAlani (5,15);
        System.out.println(alan);
        System.out.println(dikdortgenCevresi(8,7));
    }
    public static int dikdortgenAlani(int aKenari, int bKeneri){return aKenari*bKeneri;}
    public static int dikdortgenCevresi (int aKenari, int bKenari){return (aKenari+bKenari)*2;}
}
