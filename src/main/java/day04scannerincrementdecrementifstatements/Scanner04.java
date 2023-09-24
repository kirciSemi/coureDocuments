package day04scannerincrementdecrementifstatements;


import java.util.Scanner;

public class Scanner04 {

    //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
    //rakamlarin toplamini yazdiran kodu yaziniz
    //           45678 ==> 45 + 78 = 123
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen beş basamaklı bir sayı giriniz...");
        int number = input.nextInt();
        int firstTwo = number/1000;
        int lastTwo = number%100;
        System.out.println("Toplam: " + (firstTwo + lastTwo));
        // % ===> modulos operator. solda bulunan sayının sağda bulunan sayıya böliminden kalanını verir
    }


}
