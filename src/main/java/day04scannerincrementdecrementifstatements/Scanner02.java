package day04scannerincrementdecrementifstatements;

import java.util.Scanner;
public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Toplam : " + (firstNumber + secondNumber));
        System.out.println("Çıkartma : " + (firstNumber - secondNumber));
        System.out.println("Çarpma : " + (firstNumber * secondNumber));
        System.out.println("Bölme : " + (firstNumber / secondNumber));
    }
}
