package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

       int sum = add(1, 3, 4, 5,6,7,45,36,243,765,32,48);
        System.out.println(sum);

        String str = "fsalhakgha";
        System.out.println((int)str.charAt(0)+(int)str.charAt(str.length()-1));
    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static int add(int... a) {
        int topla = 0;
        for (int w:a) {
            topla +=w;
        }
        return topla;

    }

    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir

    //toplama islemi yapan bir method olusturun
//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }
//
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

}
