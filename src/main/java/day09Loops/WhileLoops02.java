package day09Loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/


        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek iştediğiniz sayıyı giriniz...");
        int num = input.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(num +  " X " + i + "= " + num*i);
            i++;
        }

        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 23455432;
        String sK = String.valueOf(k);
        String sKTers = "";
        int temp = sK.length()-1;
        while(temp>=0){
            sKTers += sK.charAt(temp);
            temp--;
        }
        if (sK.equals(sKTers)) {
            System.out.println(k + " Palindromedur");
        } else {
            System.out.println(k + " Palindrome değildir");
        }


    }
}
