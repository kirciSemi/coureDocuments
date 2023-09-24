package day04scannerincrementdecrementifstatements;

import java.util.Scanner;


public class IfStatements02 {
    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("Sayı çifttir.");
        }

        if(num%2!=0){
            System.out.println("Sayı tektir.");
        }

        //2. yol
        //if else statements

        if(num%2 == 0){
            System.out.println("Sayı Çifttir");
        }else {
            System.out.println("Sayı Tektir");
        }

        String msg = (num%2 == 0) ? "Sayı çifttir" : "Sayı tektir";
        System.out.println(msg);
    }
}
