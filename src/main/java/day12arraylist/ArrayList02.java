package day12arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]
        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        a.add('J');

        List<Character> b = new ArrayList<>();
        for (Character w :a) {
            if (!b.contains(w)){
                b.add(w);
            }
        }

        System.out.println(a);
        System.out.println(b);
        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);
        System.out.println(r.size());
        /*
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                temp.add(r.get(i));
            }
        }
        r.removeAll(temp);
         */

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);

    }
}
