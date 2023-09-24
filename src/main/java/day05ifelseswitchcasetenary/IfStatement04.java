package day05ifelseswitchcasetenary;
import java.util.Locale;
import java.util.Scanner;
public class IfStatement04 {
    public static void main(String[] args) {

        /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day
         */

        //equals() metodu casesensitivedir. Bu nedenle karşılaştırılanla aynı şekilde giriş yapılmalıdır.
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name:");
        String dayName = input.next().toLowerCase();

        if (dayName.equals("saturday")||dayName.equals("sunday")){
            System.out.println("Weekend Day");
        }else if(dayName.equals("monday")||dayName.equals("tuesday")||dayName.equals("wednesday")||dayName.equals("thursday")||dayName.equals("friday")){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }
        */
        //equalsIgnoreCase() metodu case sensitivity'i ortadan kaldırır.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name:");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("saturday")||dayName.equalsIgnoreCase("sunday")){
            System.out.println("Weekend Day");
        }else if(dayName.equalsIgnoreCase("monday")||dayName.equalsIgnoreCase("tuesday")||dayName.equalsIgnoreCase("wednesday")||dayName.equalsIgnoreCase("thursday")||dayName.equalsIgnoreCase("friday")){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }

        //Best Practice
        boolean isWeekendDay = dayName.equalsIgnoreCase("saturday")||dayName.equalsIgnoreCase("sunday");
        boolean isWeekDay = dayName.equalsIgnoreCase("monday")||dayName.equalsIgnoreCase("tuesday")||dayName.equalsIgnoreCase("wednesday")||dayName.equalsIgnoreCase("thursday")||dayName.equalsIgnoreCase("friday");

        if (isWeekendDay){
            System.out.println("Weekend Day");
        }else if(isWeekDay){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }
    }
}
