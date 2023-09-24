package day02variables;

public class Variables01 {
    public static void main(String[] args) {
        //Variable oluşturma
        int age = 113;
        System.out.println("Hello World!");
        System.out.println(age);
        /*
        Javada temelde iki tip data type vardır
        1. Primitive data_type:
            char, boolean, byte, short, int, long, float, double
        2. Non-Primitive data_type:
            String
         */

        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.

        char isminIlkHarfi = 'A';
        System.out.println(isminIlkHarfi);

        //boolean data type:  1 bit
        //boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetired =false;
        System.out.println(isRetired);

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 15;
        System.out.println("Öğrenci Yaşı: " + studentAge);

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.

        short sitePopulation = 1200;
        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int countryPopulation = 2232424;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: İnsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 77983495743254395L;
        //NOTE: Long sayılar çok büyük olduğu için sona bir 'L' harfi suffix olarak eklenir.
        //NOTE: Eğer atadığımız değer int değer aralığında ise suffix eklememize gerek yok.

        long weightOfSun = 34567;
        //Sona 'L' yazmamıza gerek olmadı. Bu halde 4 Byte yer ayırı
        //Sona 'L' yazarsak bu sayı içinde 8 Byte yer kaplayacak.

        //****************************************************
        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float shirtPrice = 1200.99F;

        //NOTE: float oluşturduğumuzda sonuna 'F' suffix eklenmeli. Java ondalıklı sayıları otomatik olarak double kabul eder.

        //*************************************************
        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla olabilir.
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double weightOfCell = 0.00000000000122;
        System.out.println(weightOfCell);

    }

}
