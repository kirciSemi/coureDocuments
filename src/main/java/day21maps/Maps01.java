package day21maps;


import java.util.*;

public class Maps01 {
    public static void main(String[] args) {

        /*
        1) Maplered sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeke her bir elemana entry denir, tamamina EntrySet denir
        4) Entryler tekrarsiz oldugu ici EntrySet denilir
        5) Mapler collection degildir
        6) HashMap ler entry leri rastgele siralar bu yuzden en hizli mapdir.
         */


        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albenia",30000000);
        countryPopulation.put("America",400000000);
        countryPopulation.put("Turkey",80000000);
        countryPopulation.put("Nedherland",40000000);
        System.out.println(countryPopulation);

        //get() methodu key ile çalışır. Girilen key' in velue değerini döndürür.
        Integer usaPopulation = countryPopulation.get("America");
        System.out.println(usaPopulation);

        //Butun keyleri almak için keyset() methodu kullanılır
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Bütün valueları almak için values() methodu kullanılır
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);

        int  sum = 0;
        for (Integer w : values) {
            sum+=w;
        }
        double avg = sum/values.size();
        System.out.println(avg);

        //Looplar mepler ile kullanılamaz bunun için entryset methodu kullanılır.
        //entrySet() methodu mapteki entryleri kalıp halinde alıp bize set içine kopyalayarak verir.
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        int toplam = 0;
        for (Map.Entry<String,Integer> w :
                entries) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);
    }
}
