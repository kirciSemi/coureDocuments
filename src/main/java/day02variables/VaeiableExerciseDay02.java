package day02variables;

public class VaeiableExerciseDay02 {
    public static void main(String[] args) {
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.

        char nameFirsCharacter = 'A';

        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean isRetried = false;

        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 13;

        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.

        short sitePopulation = 355;

        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int countryPopulation = 536477;

        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellCountOfHumanBody = 5687684732L;

        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float shirtPrice = 359.99F;

        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double weightOfCell = 0.0000000000017;

        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String studentName = "Ali Can";

        System.out.printf("Öğrenci Adı: %s%nHücre Ağırlığı: %s%nGömlek Fiyatı: %s%n",studentName,weightOfCell,shirtPrice);
    }
}
