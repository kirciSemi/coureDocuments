package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {

        /*
        1) Iterator lar loop larin yaptigi ayni isi yapar
        2) Iterator larda sonsuz loop olusma ihtimali yoktur
        3) Iterator lar ile looplar arasinda performans farki yoktur
        4) Iterator lar bir collectiondan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) iki tip iterator vardir

            a) Iterator :
                Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir

            b) ListIterator:
                Bu eleman silebilir, ekleyebilir ve degistirebilir

            Note==>
                Iterator sadece soldan saga (ilk elemandan son elemana ) calisir
                ListIterator iki yonlu calisabilir
         */


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);//[Tom, Jim, Clara, Fatma, Mustafa]

        Iterator<String> myIterator = myList.iterator();
        //hasNext() pointer a senden sonra eleman varmi diye sorar, eleman varsa true yosa false return eder
        while (myIterator.hasNext()) {
            //next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            String el = myIterator.next();
//           String name = myIterator.next();
//           System.out.println(name);
            //remove() methodu next() methodunun return ettigi elemani siler
            if (el.equals("Tom")) {
                myIterator.remove();
            }
        }
        System.out.println(myList);

        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList);

        //

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listIterator2 = list3.listIterator();

        while(listIterator2.hasNext()){
            listIterator2.next(); // Bu kod pointerı en sağa almak için yazıldı
        }
        //elemanları sondan başa doğru yazdırın
        while (listIterator2.hasPrevious()){
            String el = listIterator2.previous();
            System.out.println(el);

        }
    }
}
