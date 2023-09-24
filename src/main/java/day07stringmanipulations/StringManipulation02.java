package day07stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        //valueOf metodu kendisine verilen String değeri Double yapar ancak sadece rakamlardan oluşan bir değer olmalı. Bu nedenle "$" sembolünü replace ile silmek zorunda kaldık.
        Double totalPrice = Double.valueOf(tv.replace("$","")) + Double.valueOf(laptop.replace("$",""));
        System.out.println(totalPrice);


        //trim() bir string' in baş ve sondaki space karakterlerini siler. Ardaki space karakterlerini silmez.
        String name = "    ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println(""+first+last);


        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail

        //indexof() metodu
        String a ="abcdefg@gmail.com";
        System.out.println("company name = " + a.substring(a.indexOf("@")+1,a.indexOf(".")));

        //veya
        int startingIndex = a.indexOf("@")+1;
        int endIndex = a.indexOf(".");
        //System.out.println(a.substring(startingIndex,endIndex));
        String companyName = a.substring(startingIndex,endIndex);
        System.out.println("companyName = " + companyName);


    }
}
