package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {

        //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
        /*
        MethodCreation01 met = new MethodCreation01();
        System.out.println(met.multiply(3,6));

         */

        int carpmaSonucu = multiply(3,5);
        System.out.println("Çarpma Sonucu = " + carpmaSonucu);
        System.out.println(multiply(3,5));


        System.out.println(firstTwoMultiplyAddThird(2,3,4));

        print("Ali CAN");
    }

    protected static int multiply(int a, int b){
        return a*b;
    }

    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyAddThird(int a,int b, int c){
        return a*b+c;
    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void print(String str){
        System.out.println(str);
    }
    //Eger bir method yeni bir data üretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keyword yazilmaz
    //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
    //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.
}
