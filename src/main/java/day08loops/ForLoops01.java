package day08loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Example: Ekrana 5 kere Hi yazdır.

        //1. Yol ==> Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. Yol
        //a) for loop
        for (int i = 1 ;i<6;i++) {
            System.out.println(i + ". Hello World!");

        }

        //Example:  11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i=11; i<15; i++) {
            System.out.println(i);
        }

        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 40 ; i>22 ; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

    }
}
