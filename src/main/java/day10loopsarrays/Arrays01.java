package day10loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 7;

        //Array oluşturma örnek kodu.
        String stdNames[] = new String[5];

        System.out.println(Arrays.toString(stdNames));

        //Array' e eleman ekleme
        stdNames[0] = "Alp KIRCI";
        stdNames[1] = "Ali Özgür KIRCI";
        stdNames[2] = "Semi KIRCI";
        stdNames[3] = "Özlem KIRCI";
        stdNames[4] = "Şükrüye KOÇAK";


        System.out.println(Arrays.toString(stdNames));

        //Belli bir indexteki elemana ulaşma
        System.out.println(stdNames[3]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Girmet istediğiniz şehir adedini giriniz");
        int cityCount = scan.nextInt();
        String cities[] = new String[cityCount];

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Şehir ismi giriniz");
            cities[i] = scan.next();
        }
        int total=0;
        for (int i = 0; i<cities.length;i++)
        {
            total+= cities[i].length();
        }
        System.out.println(total);
        total = 0;
        for (String W:cities) {
            total+=W.length();
        }
        System.out.println(total);

    }
}
