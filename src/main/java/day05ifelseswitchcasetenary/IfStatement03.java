package day05ifelseswitchcasetenary;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşı giriniz...");
        byte age = input.nextByte();

        //Ağır çalışır Aşağıdaki hali daha hızlı
        if(age >=0 && age <=4)
        {
            System.out.println("Baby");
        } else if(age >=5 && age <=12)
        {
            System.out.println("Boy");
        }else if(age >=13 && age <=20)
        {
            System.out.println("Adolacens");
        }
        else if(age >=21 && age <=30)
        {
            System.out.println("Adult");
        } else if(age > 30){
            System.out.println("Not defined");
        }else{
            System.out.println("Age never be negative");
        }

        //Best Practice
        if(age<0){
            System.out.println("Geçerli bir yaş giriniz");
        } else if (age < 5){
            System.out.println("Bebek");
        }else if (age < 13){
            System.out.println("Çocuk");
        }else if (age < 21){
            System.out.println("Genç");
        }else if (age < 31){
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamış yaş...");
        }
    }
}
