package day12arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Integer> newAgesT = new ArrayList<>();
        ages.add(5);
        ages.add(7);
        ages.add(19);
        ages.add(1, 313);
        ages.add(3, 777);
        ages.add(999);
        newAgesT.add(1);
        newAgesT.add(2);
        newAgesT.add(3);
        ages.addAll(newAgesT);
        ages.addAll(0, newAgesT);
        int numOfElement = ages.size();
        ages.set(1, 313);
        int element = ages.get(2);
        //add() metodu arrayListe eleman ekler
        //Eklenen her yeni eleman son indexe eklenir
        //add(index,value) metodu ile eklenecek elemanın indexsini söyleyerek belirli bir indexse ekleme yapabilirsiniz.
        //size() metodu arrayListin boyutunu yani uzunluğunu eleman sayısını verir.
        //set(index, value) metodu belirli bir indexdeki değeri değiştirip yerine yeni yazılan değeri atar
        //get(index) metodu verilen indexdeki elemanın getirir.


        System.out.println(ages);
        System.out.println(numOfElement);
        System.out.println(ages.get(2));
        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);

        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0)
            {
                list.set(i,11);
            }
        }

         */
        //Arraylisttte indexOf() metodu gönderilen değerin ArrayListtedi indexini döndürür.
        for (int w : list) {
            if (w % 2 != 0) {
                list.set(list.indexOf(w), 11);
            }
        }
        System.out.println(list);
    }
}
