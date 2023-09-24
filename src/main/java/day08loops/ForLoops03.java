package day08loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int sum = 0;

        for (int i = 578; i > 0; i=i/10) {
            sum += i%10;
        }
        System.out.println(sum);

        //Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String t = "mehmet";
        String unique = "";

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            //bir karakterin indexOf ile ilk indexini lastIndexOf ile son indexini buluruz. Eğer bu iki değer eşitse indexini bulduğumuz karakter eşsizdir.
            if (t.indexOf(ch)==t.lastIndexOf(ch)) {
                unique+=ch;
            }
        }
        System.out.println(unique);

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int total = 0;

        for (int i = 5; i <=8 ; i++) {
            total+=i;
        }
        System.out.println(total);

        int x = 1;
        for (int i = 7; i <=9 ; i++) {
            x*=i;
        }
        System.out.println(x);
    }
}
