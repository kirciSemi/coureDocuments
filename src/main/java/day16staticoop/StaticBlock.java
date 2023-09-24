package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {


    //Bir variable  olusturdugunzda deger atamazsaniz o variable i initialize etmediniz demektir
    //Gereksinimlere gore bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir
    //bu yüzden static block lar kullanilir
    //static variable lar static block lar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmis olur
    static double pi;
    public static int price;

    static {
        pi = 3.14;
        System.out.println("Static block1");

    }

    static {
        System.out.println("Static block2");
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue()==8) {
            price = 1000;
        }else{
            price=2000;
        }
    }

    public static void main(String[] args) {
        System.out.println("pi = " + pi);
        System.out.println("Main metod");
    }


}
