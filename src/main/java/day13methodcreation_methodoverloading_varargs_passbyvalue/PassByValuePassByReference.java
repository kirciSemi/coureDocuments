package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        System.out.println(add(x, y));


    }

        /*
        Pass By Value :
            1) Java Pass By Value kullanir
            2) Yani java methodlarin orjinal degeri degistirmesine müsade etmez
            3) java methodlara deger yollarken orjinal degerin kopyasini olusturur, ve o kopyayi methoda yollar
            Method kopya deger üzerinde degisiklik yapar, böylece orjinal deger korunmus olur

        Pass By Reference:
            1) Pass by Reference da method a reference yollanir
            2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
         */

    public static int add(int a, int b) {
        return a + b;
    }
}
