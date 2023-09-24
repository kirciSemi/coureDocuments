package day26lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);
        System.out.println(getProductFromThreeToNine2());
        System.out.println("getProductFromThreeToNine() = " + getProductFromThreeToNine());


        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvensBetweenTwoInteger(12, 5));
    }
    //4) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
    }

    //1. Yol
    public static int getProductFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2. Yol
    public static int getProductFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("negatif değerlerin faktoriyeli hesaplanmaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

    //7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInteger(int a, int b) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return IntStream.
                range(a + 1, b).
                filter(Utils::isNumberEven).
                sum();
    }
}
