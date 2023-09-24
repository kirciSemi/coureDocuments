package day20collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        //1. Yol

        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("t@hotmail.com");
        emails.add("h@yahoo.com");
        emails.add("z@gmail.com");
        emails.add("a@gmail.com");
        System.out.println(emails);
        long t2 = System.nanoTime();

        //2. yol
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("t@hotmail.com");
        emailsHs.add("h@yahoo.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("a@gmail.com");
        TreeSet<String> emalisHsTs = new TreeSet<>(emailsHs);
        System.out.println(emalisHsTs);
        long t3 = System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}
