package day16arraysforeachloop;

import java.util.Arrays;

public class TekrarArrays01 {
    public static void main(String[] args) {

        String kutuk []= new String[4];

        System.out.println(Arrays.toString(kutuk));

        kutuk [0] = "Enver";
        kutuk [1] = "Sinem";
        kutuk [2] = "Mehmet Orhan";
        kutuk [3] = "Mustafa Alper";

        System.out.println(Arrays.toString(kutuk));
        System.out.println("3 . Array : "+kutuk[3]);

        for (int i = 0; i < kutuk.length; i++) {
            System.out.println(kutuk[i]+" SEZGIN");
        }

        int toplamHarf = 0 ;

        for ( int j = 0 ; j<kutuk.length ; j++ ) {
            toplamHarf = toplamHarf + kutuk[j].length();
            System.out.println(toplamHarf);
        }

        int harfToplami =0;

        for (String w:kutuk) {
          harfToplami=harfToplami + w.length();
        }
        System.out.println("harfToplami = " + harfToplami);


        double boylar[] = new double[4];
        boylar[0]=1.87;
        boylar[1]=1.60;
        boylar[2]=1.70;
        boylar[3]=1.45;

        double boyToplami = 0;

        for (double w: boylar ){
            boyToplami = boyToplami + w;
        }
        System.out.println("boyOrt. = " + boyToplami/boylar.length);

        Arrays.sort(boylar); // boylar Arraylarini kucukten buyuge siralar
        System.out.println(Arrays.toString(boylar));

        double enUzunBoy = boylar[0];
        double enKisaBoy = boylar[0];

        for (double w : boylar){
            enKisaBoy = Math.min(enKisaBoy, w);
            enUzunBoy = Math.max(enUzunBoy,w);

            System.out.println("enKisaBoy = " + enKisaBoy);
            System.out.println("enUzunBoy = " + enUzunBoy);
        }
        System.out.println("enKisaBoySonTahlilde = " + enKisaBoy);
        System.out.println("enUzunBoySonTahlilde = " + enUzunBoy);


    }
}