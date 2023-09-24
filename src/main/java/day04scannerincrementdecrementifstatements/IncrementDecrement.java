package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        a = a + 2;//a nın değeri 7 oldu
        System.out.println("a: " + a);
        a+=2; // yukarıdaki gibi a ın değerini 2 arttırıp a ya atar.
        System.out.println("a: " + a);

        //Decrement

        int c = 8;
        c = c- 3;//c'nin değeri 5
        System.out.println("C: " + c);
        c-=3;//'-=' operatorü decremet için kullanılır.
        System.out.println("C: " + c);

        //Increment 2

        int d = 6;

        d = d * 2; // d' nin değerini iki ile çarpıp d'ye atar
        System.out.println("D: " + d);

        d*=2; // d' nin değerini iki ile çarpıp d'ye atar
        System.out.println("d: " + d);

        //Decrement 2

        int e = 24;
        System.out.println("e = " + e);
        e = e / 2;
        System.out.println("e = " + e);

        e /= 2;
        System.out.println("e = " + e);

        // 1 ile increment
        int f = 13;
        // f = f + 1;
        // f+=1;
        f++;
        System.out.println("f = " + f);

        //1 ile decrement
        int h = 9;
        //h = h -1;
        //h-=1;
        h--;
        System.out.println("h = " + h);

        //post-increment / pre-increment

        int i = 10;
        int k = i++;//POST increment
        //kodlar soldan sağa çalıştığı için ilk olarak = görülür ve i değeri k değişkenine atanır sonra ++ görülür ve i değeri arttırılır. Bu durumda k değeri 10 i değeri 11 olur.
        System.out.println("k = " + k);
        System.out.println("i = " + i);

        int m = 15;
        //kodlar soldan sağa çalıştığı için ilk olarak ++ görülür ve m değeri arttırılır ve sonra m değeri görülüp n değerine atanır. Bu nedenle m 16 olur ve sonra n değişkenine 16 atanır sonuçta ikiside 16 olur
        int n = ++m;//PRE increment
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        //ornek
        int p = 17;
        int r = p--;
        System.out.println("p = " + p);
        System.out.println("r = " + r);

        int s = 20;
        int t = --s;
        System.out.println("s = " + s);
        System.out.println("t = " + t);
    }
}
