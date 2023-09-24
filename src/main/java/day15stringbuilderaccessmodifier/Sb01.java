package day15stringbuilderaccessmodifier;

public class Sb01 {
    public static void main(String[] args) {


        /*
        1) StringBuilder classi da string üreten bir classtir
        2) "String" class kullanarak string üretiriz, java nicin StringBuilder Classi da olusturdu?
            => String class "immutable" ( degistirilemez) string üretir
            => StringBuilder class "mutable"( degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
         */


        //immutable
        String s = "Java";
        String t = s + "x";
        String w = t + " ? ";

        /*
        1) StringBuilder classi da string üreten bir classtir
        2) "String" class kullanarak string üretiriz, java nicin StringBuilder Classi da olusturdu?
            => String class "immutable" ( degistirilemez) string üretir
            => StringBuilder class "mutable"( degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
         */


        //mutable
        //StringBuilder kullanarak string üretmenin 1. yolu

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);

        sb1.append("!");
        System.out.println(sb1);

        String a = "money";
        a = a + " more";
        // money bulunan a stringine more eklendiği zaman orjina heap alanı ellenmez yerine yeni bir heap alanıa açıp bu alana yeni değeri verir ve stack deği referensı yeni heaple değiştirir. eski heap alanı havada kalır bu alandaki bilgi kullanılmayan bilgi olduğu için Garbage Collector denilen Java mekanizması bu havada kalan kodları temizler ncak bu durum sisteme artı bir yük bindirir.

        //StringBuilder a = "ali"; Bu şekilde bir StringBuilder oluşturmak mümkün değişdir!!!
        //Stringler aslında aşağıdaki şekilde oluşturulur ancak String nesnesi çok defa oluşturulduğu için Java Stringe özel primitive dataType lardaki oluşturma metodunu Stringede vermiştir
        //String s1 = new String("Ali");
        //System.out.println(s1);


        //StringBuilder kullanarak string üretmenin 2. yolu

        StringBuilder sb2 =new StringBuilder();

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());



        //capacitiy ve lentgh arasindaki fark nedir?
        /*
        capacity javanin size verdigi data depolama yer sayisidir,
        Length ise size verilen data depolama yerinin kullanilan kismidir

        java baslangic olarak size capacity i 16 olarak verir, siz verilen capacity i asarsaniz
        java yeni capacity i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        16 ==> 16*2+2  -- 34 ==> 34*2+2
         */

        //StringBuilder kullanarak string üretmenin 3. yolu
        //Default Capacity nasıl değiştirebiliriz
        //Belirtilen capacity yetmezse java *2 + 2 olarak capacity' i arttırmaya devam eder.
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("Ali");
        System.out.println(sb3.capacity());

    }
}
