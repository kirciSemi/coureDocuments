package day05ifelseswitchcasetenary;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hatanın gün sayısını giriniz: ");
        byte num = input.nextByte();
        if(num ==1 ){
            System.out.println("Pazar (Sunday)");
        }else if(num ==2 ){
            System.out.println("Pazartesi (Monday)");
        }else if(num ==3 ){
            System.out.println("Salı (Tuesday)");
        }else if(num ==4 ){
            System.out.println("Çarşamba (Wednesday)");
        }else if(num ==5 ){
            System.out.println("Perşembe (Thursday)");
        }else if(num ==6 ){
            System.out.println("Cuma (Friday)");
        }else if(num ==7 ){
            System.out.println("Cumartesi (Saturday)");
        }else{
            System.out.println("Hatalı giriş yaptınız. Lütfen 1 ile 7 arasında bir sayı giriniz...");
        }
    }
}
