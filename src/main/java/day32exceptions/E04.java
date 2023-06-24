package day32exceptions;

import java.io.FileInputStream;// io ==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    /*
    1) Run button una bastiktan sonra console da alinan Exceptionlara "Runtime Exception" denir
        ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
        StringIndexOutOfBoundsException.... RunTime Exception lara ornektir
        Runtime Exceptionlara Unchecked Exception da denir

    2) Code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir, bunlara da "Compile Time Exception" denir
        FileNotFoundException, IOException compile time exception lara ornektir
        Compile Time Exception lara Checked Exception da denir
     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");

        int k =0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }



    }
}