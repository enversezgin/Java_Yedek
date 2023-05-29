package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
       /*while loop kalibi
        baslangic degeri

         while (loop calisma kurali ){

            calisacak kodlar

            artirma/azaltma
         }*/
        /*
        baslangic degeri
                do{
                    calisacak kodlar
                    artirma/azaltma
                }while(loop calisma kurali);
        */

        //Ornek 1: 5  den 3 e kadar tamsayilari console a yazdiriniz
        int a=5;

        do {
            System.out.print(a);        // 543
            a--;
        }while (a>2);

        System.out.println( "\n"+"/-/-/-/-/-/-/-/-/");

        //  1) while-loop
        int i =1;
        while (i<1){
            System.out.println("Sen bir while loopsun..");
            i++;
        }
        //while loop ta zero execution (idam-infaz-yapma) mumkundur (once sorgula sonra yap)


        //2) do-while-loop
        int k =1;
        do{
            System.out.println("Sen bir do-while loopsun..");
            k++;
        }while (k<1);
        //do while kullandiginizda loop body en az bir kere calisir, zero execution mumkun degildir.
        //once yapar sonra sorgular ;)







    }
}