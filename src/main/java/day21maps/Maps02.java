package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmey",41);


        //Keyi tekrarlı kullandığımızda en son verilen entry nin değerini kabul eder
        stdAges.put("Tom",35);
        System.out.println(stdAges);

        //peplace() methodu valueları keyleri kullanarak update etmeye yarar
        stdAges.replace("Tom",39);
        System.out.println(stdAges);

        //replace("Tom",39,41) methodu key' i Tom ve value değeri 39 ise yeni değeri 41 yapar
        //iki aşamalı bir kontrol yapar.
        stdAges.replace("Tom",39,41);
        System.out.println(stdAges);

        //putIfAbsent("Ayşe",77) methodu mapte Ayşe keyi yoksa ekler eğer varsa eklemez.
        stdAges.putIfAbsent("Ayşe",77);
        System.out.println(stdAges);

        //get() ve GetOrDefault() metodları eğer aranan eleman map te var ise iki method da aynı işi yapar
        //valueları verir
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom", 0));

        //eğer eleman mapte yoksa get() null verir
        //eğer eleman mapte yok ise getOrDefault() default verilen değeri döner
        System.out.println(stdAges.get("Jerry"));//null değer döndürür
        System.out.println(stdAges.getOrDefault("Jerry", 0));// olmadığı için null değil default değeri verir

        //containsValue() methodu valulariçinde verilen valuenun olup olmadığını control eder
        System.out.println(stdAges.containsValue(19));
        System.out.println(stdAges.containsValue(99));

        //containsKey() methodu keylar içinde verilen keyin olup olmadığını control eder
        System.out.println(stdAges.containsKey("Tom"));
        System.out.println(stdAges.containsKey("TOM"));//false gelir çünkü casesensitivedir

        stdAges.remove("Tom");
        System.out.println(stdAges);

        //remove() methoduna key ve value değeri gönderilirse her ikisininde uyuştuğu entry varsa silinir.
        stdAges.remove("Can",9);
        System.out.println(stdAges);
    }

}
