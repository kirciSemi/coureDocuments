package day04scannerincrementdecrementifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //İf statements
        /*
        if(you study hard){
            you will learn java ===>
        }
        */
        //Ornek: sayi -1 ile 10 arasında ise ekrana "Rakam" yazdırın

        int num = 4;

        if (num>-1 && num<10){
            System.out.println("Rakam");
        }else{
            System.out.println("Rakam değil");
        }

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int n = 123;

        if (n>99 && n<1000)
        {
            System.out.println("Sayı üç basamaklıdır.");
        }
    }
}
