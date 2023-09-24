package day22map_exception;
/*
        Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception classi devreye girer.
        Exception classi biz karsilasilan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebini veir
        Java exception firlattiginda kodun calismasini durdurur. ve bizden bir karar vermemizi bekler
        ==> Eger gereksinimlere gore kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi
        try catch blogu icine yazmaliyiz
        ==> Excepion i halledebilmek icin iki temel yol vardir
            a) Exception a uygun cozumler uretebilirsiniz. Buna Excepion Handling denir
                bunun icin try catch kullanilir, try block icinde yapilmasi istenen islemi javadan yapmasi istenir
                java islemi problemsiz bir sekilde yaparsa cathc block java tarafindan okunmaz
                try block da islem yapilirken Exception olusursa catch block devreye girir ve catch block icinde ki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki hata sonrasi kodlar calistirilmaz
            b) Execption olustugunda bunu ilan eder ve geri cekilirsiniz, bunada throw exception denir

        ==> catch parantezi icindeki karsilasmamiz muhtemel olan exception class isimini ve bir obje ismini (e),
        catch block una ise exception ile karsilasilidiginda yapilmasini istedigimiz kodlari yazariz

        => Yazdiginiz kod calismadiginda problemi bulmak icin log lara bakariz


         */

public class E01 {
    public static void main(String[] args) {

        divide(12,0);
        divide2(5,0);
        divide2(18,9);
    }
    public static void divide2(int a,int b){
        try {

            if(a<b) {throw new RuntimeException();}
            else {System.out.println(a/b);}
        }catch (ArithmeticException e)
        {
            System.out.println("Hata oluştu. Hata mesajı: "+e.getMessage());
            System.out.println("Do not divide by Zero");
        }
        catch (RuntimeException e){
            System.out.println("Bölen Bölünenden büyük olamaz");
        }
        System.out.println("Try-Catch sonrası kod akışına devam edildi");
    }
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("Do not divide by Zero");
        }
        else {
            System.out.println(a/b);
        }
    }
}
