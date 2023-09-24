package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Passwordunüzü girinz...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun
        boolean lenghtPwd = pwd.length()>7;
        System.out.println("lenghtPwd = " + lenghtPwd);

        boolean spaceControl = !pwd.contains(" ");//Space var mı kontrol ediyoruz. Contain içerip içermediğine bakar. Biz olmasını istemediğimiz için (!) ile değilini alıyoruz.
        System.out.println("spaceControl = " + spaceControl);

        //Parolada büyük harf olup olmadığını kontrol etmek için diğer bütün karakteler silinir ve Stringin uzunluğu kontrol edilir. eğer uzunluk 0' dan büyükse büyük harf var demektir eğer 0 ise büyük harf yoktur.
        //[^A-Z] büyük harfler hariç diğer bütün karakterler demek regex' te.
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        boolean lowerCase = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("lowerCase = " + lowerCase);

        boolean numberControl = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("numberControl = " + numberControl);

        boolean result = lenghtPwd && spaceControl && upperCaseControl && lowerCase && numberControl;

        if (result){
            System.out.println("Geçerli bir parola tanımladınız..");
        }else{
            System.out.println("Geçersiz bir parola tanımladınız");
        }

    }
}
