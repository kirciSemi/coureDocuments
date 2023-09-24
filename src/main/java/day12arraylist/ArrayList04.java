package day12arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,9,7);
        //list.remove(0);
        //list.add(5);
        //list.clear();

        /**
         * Arrays.asList() kullanarak kısa yoldan liste oluştura biliriz ancak bu şekilde oluşturulan listelerde listedeki eleman sayısını değiştiren metodları kullanamayıs.
         * asList olduğu için arka tarafta Array gibi çalışır ArrayList gibi çalışmaz.
         * set(), size() gibi metotları kullanabilirz.
         * Array yerine kullanılabilir.
         */
        list.set(0,5);
        System.out.println("list = " + list);

    }
}
