package day06switchternarystring;

import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen mutlak değeri hesaplamak istediğiniz değeri giriniz...");
        int num = input.nextInt();
        int result = num<0?num*-1:num;
        System.out.println("Mutlak Değer: " + result);

        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

        int num1 = 5;
        int num2 = -6;

        Object result1 = (num1>0 && num2>0)||(num1<0 && num2<0)?(num1*num2):"Farklı işaretli sayılar çarpamıyorum";

        System.out.println(result1);
        //Object java da butun Non-primitive (classlarin) ortak parent(baba) idir (==>Hz. Adem gibidir)
        //Object in parenti yoktur.
        //farkli data tipleri icin ortak bir variable olusturmak istediginizde data type olarak object kullaniriz,

    }
}
