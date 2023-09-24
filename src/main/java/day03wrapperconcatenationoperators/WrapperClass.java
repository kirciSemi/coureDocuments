package day03wrapperconcatenationoperators;

public class WrapperClass {
    public static void main(String[] args) {

        //Java, primitive data type lara bazı yeni metotlar ekleyerek yeni bir yapı oluşturmuştur.
        //bu yeni yapılara "WrapperClass" olarak adlandırmıştır

        //primitive: char - boolean - byte - short - int - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer- Long - Float - Double
        int n = 12;
        Integer m = 12;

        // WrapperClass sarmalayan sınıf demek

        //Ornek: Primitive integerı wrapper ınteger a cevirin

        int num = 13;
        Integer wrapperNum = num; //AutoBoxing işlemi yapılıyor

        //Ornek: Wrapper Byte i primitive byte a ceviriniz

        Byte k = 19;
        byte primitiveK = k; // Unboxing işlemi yapıldı.


    }
}
