package day05ifelseswitchcasetenary;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

         /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender...");
        String gender = input.next();
        System.out.println("Enter your age...");
        byte age = input.nextByte();

        //nested yapılar kullanılması tavsiye edilmiyor. It's time consuming
        if(age<0 || age>120){
            System.out.println("Age must between 0 and 120");
        }else if(gender.equalsIgnoreCase("female"))
        {
            if(age > 60)
            {
                System.out.println("You can retired");
            }
            else {
                System.out.println("You cannot retired");
            }
        }else if(gender.equalsIgnoreCase("male")){
            if(age > 65)
            {
                System.out.println("You can retired");
            }
            else {
                System.out.println("You cannot retired");
            }
        }else{
            System.out.println("Invalid gender...");
        }
    }
}
