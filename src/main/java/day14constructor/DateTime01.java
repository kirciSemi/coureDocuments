package day14constructor;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //İçinde bulunduğumuz zaman dilimindeki tarihi verir
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-08-28
        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST (enum)
        System.out.println(myCurrentDate.getDayOfWeek());//MONDAY (enum)

        //İleriki bir tarihe nasıl gidilir
        System.out.println(myCurrentDate.plusDays(3).plusMonths(2).plusYears(1));
        System.out.println(myCurrentDate.minusDays(4).minusMonths(5).minusYears(1));

        //Spesific bir tarih objesi oluturma
        LocalDate date1 = LocalDate.of(1980, 5, 10);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(1990, 5, 10);
        boolean r1 = date1.isBefore(date2);
        System.out.println(r1);

        boolean r2 = date1.isAfter(date2);
        System.out.println(r2);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter year,month, and day numbers in the given order");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        LocalDate givenDate = LocalDate.of(year,month,day);
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid Date");
        }else{
            System.out.println("You can enter time for the ticket");
        }
        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Please enter year,month, and day numbers in the given order as your birthday");
        int byear = scan.nextInt();
        int bmonth = scan.nextInt();
        int bday = scan.nextInt();
        LocalDate bGivenDate = LocalDate.of(byear,bmonth,bday);
        System.out.println(bGivenDate.getDayOfWeek());
    }
}
