package day04scannerincrementdecrementifstatements;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı yazınız: ");
        String nameSirname = input.nextLine();
        System.out.println("Yaşınızı giriniz: ");
        byte age = input.nextByte();
        System.out.println("Boyunuzu giriniz: ");
        float height = input.nextFloat();
        System.out.println("Kilonuzu giriniz: ");
        short weight = input.nextShort();
        System.out.println("Medeni durumunuz: ");
        String isMaried = input2.nextLine();
        //next metodu kullanıcıdan tek kelimelik string almak için kullanılır
        System.out.println("Ad Soyad = " + nameSirname);
        System.out.println("Yaş = " + age);
        System.out.println("Boyunuz = " + height);
        System.out.println("Kilonuz = " + weight);
        System.out.println("Medeni Durum = " + isMaried);

    }
}