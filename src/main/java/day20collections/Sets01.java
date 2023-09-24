package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

         /*
    1)Set' ler tekrarsiz eleman  (unique) depolamak icin kullanilir
    2) 3 tane Set Class i vardir
        a) HashSet Class
            Hash benzersiz id olusturma teknigidir. Bu teknige Hashing technique denir
            HashSet elemanlari rastgele siralar
            HashSet elemanlari siralamadigidan cok hizli calisir
            HashSetler nulli eleman kabul eder

        b) LinkedHashSet Class
            LinkedHashSet ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order) Hashsetlere gore yavastirlar

        c) TreeSet Class
            TreeSet elemanlari natural order a gore dizerler.
            ve bu nedenle cok yavastirlar, en yavas settir
            nulli eleman olarak kabul etmezler
      3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
     */

        HashSet<String> hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);
        hs.add("Tuba");//Tekrarlı elemanları eklerken hata vermez ama sadece bir defa ekler
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(4);
        lhs.add(11);
        lhs.add(313);
        lhs.add(34);
        lhs.add(null);
        System.out.println(lhs);
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(5);
        ls.add(4);
        ls.add(17);
        ls.add(33);
        ls.add(345);
        System.out.println(ls);

        lhs.retainAll(ls);//lhs setinin içinde ls ile ortak olan elemanları bıraktı diğerlerini sildi.
        System.out.println(lhs);
        System.out.println(ls);


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('t');
        ts.add('s');
        ts.add('a');
        ts.add('c');
        ts.add('g');
        ts.add('z');
        ts.add('u');
        //ts.add(null);Null değeri eleman kabul etmez
        System.out.println(ts.subSet('c', 's'));
        System.out.println(ts);


    }
}
