package day20collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */

        //isertion order olarak sıralaar yani ekleme sırasına göre sıralar
        LinkedList<String> lList = new LinkedList<>();
        lList.add("ali");
        lList.add("Veli");
        lList.add("Semi");
        lList.add("Can");
        lList.add("Kübra");
        lList.add("Semi");
        lList.add("Tuba");
        lList.add("Duygu");
        lList.add(2,"Semi");//Belirtilen indexe ekler
        lList.addFirst("Elif");//Başa ekler
        lList.addLast("Mahmut");//Sona Ekler
        System.out.println(lList);
        System.out.println(lList.get(3));
        //lList.remove("Semi");
        //lList.removeFirstOccurrence("Semi");
        lList.removeLastOccurrence("Semi");

        //peek()
        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns: the head of this list, or null if this list is empty
        System.out.println("lList.peek() = " + lList.peek());//İlk nodu silmeden size verir
        System.out.println("lList = " + lList);

        //pool()
        //Retrieves and removes the head (first element) of this list.
        //Returns: the head of this list, or null if this list is empty
        System.out.println("lList.poll() = " + lList.poll());//İlk nodu bize verir ama listeden siler
        System.out.println("lList = " + lList);

        /*
        * peek() ile element() metodu ilk elemanı bize silmeden verir.
        * peek() liste boş ise nul değer döner ama element() boş liste için hata döndürür
        * */
        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns: the head of this list
        //Throws: NoSuchElementException – if this list is empty
        System.out.println("lList.element() = " + lList.element());
        System.out.println("lList = " + lList);


        /*
        * pool() gibi getirir ama listeden siler.
        * pop() pool()' dan farklı olarak listenin boş olması durumunda pool() null verrirken
        * pop() hata gönderir.
        * */
        System.out.println("lList.pop() = " + lList.pop());
        System.out.println("lList = " + lList);

    }
}
