package day02variables;

public class Variables02 {
    //Non-Primitive Data Type
    public static void main(String[] args) {
        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String oluştururken atanacak değer çift tırnak içine yazılmalıdır.
        String studentName = "Ali Can";
        System.out.println(studentName);
        //Stringlerin default değeri 'null' dır
        //null '0' demek değildir. '0' da coding de bir değerdir.
        //null hiçlik demektir
        //içinde variable veya method bulunmayan boş bir obje demek.

        /*
        interviev sorusu:
        primitive ve non-primitive data type lar arasındaki fark nedir?
        1. Primitiveler sadece bizim atadığımız değeri içerir. Non primitivler bizim atadığımız değeri ve metotlar içerir.
        2. primitivler küçük harfle başlar. Non primitiveler büyük harfle başlar. non primitive tipler birer classtır bu nedenle büyük harfle başlar.
        3. primitiveleri Java üretmiştir ve 8 (sekiz) adettir. Non primitiveleri Java ve programcılar üretebilir bu nedenle belirli bir sayı sınırı verilemez.
        4. primitiveler memoryde data typelarına göre sabit boyutta bellek kullanır. Non-primitiveler memoryde büyüklüğüne göre değişen boyutlarda alan kullanır.
         */

        byte ogrenciNotu1 = 85;
        byte ogrenciNotu2 = 45;
        System.out.println("Birinci Öğrenci Notu:" + ogrenciNotu1);
        System.out.println("İkinci Öğrenci Notu: " + ogrenciNotu2);
        System.out.printf("Öğrenci not toplamı: %s%n",ogrenciNotu1+ogrenciNotu2);
    }
}
