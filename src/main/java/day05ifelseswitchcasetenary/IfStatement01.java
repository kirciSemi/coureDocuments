package day05ifelseswitchcasetenary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int num = input.nextInt();

        if(num > 0)
        {
            System.out.println("Sayı pozitiftir");
        } else if (num == 0){
            System.out.println("Sayı nötr (0) dır");
        } else {
            System.out.println("Sayı negatiftir");
        }

        String msg = (num>0) ? "Sayı pozitiftir" : (num<0) ? "Sayı negatiftir" : "Sayı nötr";
        System.out.println(msg);
    }
}
