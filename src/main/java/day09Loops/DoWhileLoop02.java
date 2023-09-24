package day09Loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
         /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Lütfen bir Sayı giriniz...");
            num = input.nextInt();
            if(num>=100)
            {
                System.out.println("Kazandınız...");
            }else {
                System.out.println("Kaybettiniz..");
            }
        } while (num<100);
    }
}
