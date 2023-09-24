package day03wrapperconcatenationoperators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1. adim : Scanner Class'tan object olustur
        Scanner input = new Scanner(System.in);
        byte age = 0;

        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
        //System.out.println("Type your age, please: ");

        //3. admi : Uygun method'u kullanarak kullanicinin verdigi data yi memory e yerlestiriniz
        while (true) {
            try {
                System.out.println("Type your age, please: ");
                age = input.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Your input out off range. System exeption message: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Your input has nonnumeric value:  " + e.getMessage());
            }
            System.out.println("Your age: " + age);
            break;
        }
    }
}
