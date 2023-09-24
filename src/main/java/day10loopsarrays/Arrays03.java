package day10loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers = {12, 3, -3, 5, 23};

        for (int w : numbers) {
            if (w < 5) {
                System.out.println(w);
            }
        }

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"A","T","K","E","B"};
        //Binary Search metodu
        Arrays.sort(names);
        if(Arrays.binarySearch(names,"T")>0){
            System.out.println("T karakteri dizide vardır");
        }else {
            System.out.println("T katakteri dizide yok");
        }

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        String[] sents = s.split(" ");
        System.out.println(sents.length);
        System.out.println(s.split(" ").length);


    }
}
