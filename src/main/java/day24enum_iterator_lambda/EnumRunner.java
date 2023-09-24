package day24enum_iterator_lambda;

import java.util.List;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        Cities hatay = Cities.HATAY;
        System.out.println(hatay.getCityName());
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);


        ////Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Plaka kodunu giriniz");
        int plate = input.nextInt();
        Cities[] cities = Cities.values();

        if(plate>81 || plate<1)
        {
            System.out.println("Girmiş olduğunuz plaka geçersizdir");
        }else {
            for (Cities w :cities) {
                if (w.getPlateCode() == plate){
                    System.out.println("Girmiş olduğunuz plaka "+w.getCityName()+" iline aittir");
                    break;
                }
            }
        }

    }
}
