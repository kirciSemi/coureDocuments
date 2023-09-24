package day08loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String var = "I love Java";

        for (int i = 0 ; i<var.length(); i++) {
            char ch = var.charAt(i);
            /*
            if (ch!='a') {
                System.out.print(ch);
            }else{break;}*/

            //veya

            if (ch=='a') {
                break;
            }
            System.out.print(ch);
        }
        /*
        for (int i = 1; i <1001; i++) {
            if (i%5 ==0 && i%7!=0) {
                System.out.println(i);
            }
        }*/

        //Example 2: Verilen bir string'de küçük harfleri consola yazmayınız
        //"Pwd12?Ab"  = P12?A

        String s1 = "Pwd12?Ab";
        System.out.println();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);
            }
        }
        //break ile continue arasindaki fark nedir?
        //break switch in disina cikmak icin ve loopu kirmak icin kullanilir.
        //continue ise loop calisirken java bu keywordu okudugunda artirma/azaltma kısmından yoluna devam eder
        //continue loop yaparken bazi kodlari isleme sokmamak icin kullanilir

        //ornek 3 Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        System.out.println();
        String s2 = "Java";
        String ters="";
        for (int i = s2.length()-1; i >= 0 ; i--) {
            ters+=s2.charAt(i);
        }
        System.out.println(ters);
    }
}
