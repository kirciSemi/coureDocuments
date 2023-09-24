package day09Loops;

import java.util.Scanner;

enum Days{
    Pazartesi,
    Sali,
    Çarşamba,
    Perşembe,
    Cuma,
    Cumartesi,
    Pazar;


}

public class ForLoops01 {
    public static void main(String[] args) {

         /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1 ; i < 5; i++) {
            System.out.println("Week : "+i);
            for (int k = 0; k < 7; k++) {
                System.out.println("    Day"+k+" : " + Days.values()[k].toString());
            }
        }

         /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayısını giriniz: ");
        int row = input.nextInt();
        System.out.println("Sütün sayısını giriniz: ");
        int column = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j<column; j++) {
                    System.out.print("X");
            }
            System.out.println();
        }
    }
}
