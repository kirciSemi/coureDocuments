package day10loopsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Example: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz...");
        int arrayLenght = scan.nextInt();
        int[] numbers = new int[arrayLenght];
        for (int i = 0; i< numbers.length;i++){
            System.out.println("Lüfen sayıyı giriniz");
            numbers[i] = scan.nextInt();
        }
        //1. Yol
        Arrays.sort(numbers);
        System.out.println("Büyük Sayı: "+numbers[numbers.length-1]+" Küçük sayı: "+numbers[0]+"\nToplam: "+ (numbers[0]+numbers[numbers.length-1]));

        //2. Yol
        int min = numbers[0];
        int max = numbers[0];
        /*
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }*/
        for (int w : numbers) {
            min = Math.min(min,w);
            max = Math.max(max,w);
        }
        System.out.println("Toplam : "+ (min + max));

    }
}
