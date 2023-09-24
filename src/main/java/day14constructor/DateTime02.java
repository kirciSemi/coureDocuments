package day14constructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class DateTime02 {

    //Anlık Zamanı nasıl alırız
    public static void main(String[] args) {
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

            /*
            DateTime Class ta kullanilan tarih saat formatlari
            HH : mm ==> 24'lu saat sistemi
            hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
            hh : mm a ==> 12'li saat sistemi AM, PM
            HH : mm : ss==> saniyeyi gosterir
            HH : MM ==> yanlis format cunku MM aylar icin kullanilir
            "mm" "minute" demektir. "MM" "month" demektir.

            dd-MM-yyyy ==> gun - ay - yil
            MMM ==> Aug
            MMMM ==> August
            */
        DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("HH : mm : ss");
        String formattedTime = dft1.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime);

        //Date objesini formatlayalım

        LocalDate myDate = LocalDate.of(2022,8,28);

        DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatedDate = dft2.format(myDate);
        System.out.println("formatedDate = " + formatedDate);
        DateTimeFormatter dft3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dft3.format(myDate));
    }
}
