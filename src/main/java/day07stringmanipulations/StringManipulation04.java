package day07stringmanipulations;

public class StringManipulation04 {

    public static void main(String[] args) {

        /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
           i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
           ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
           iii) Başında ve sonunda boşluk olmamalıdır.
       */

        String pwd = "       ";
        //pwd.isEmpty() bir string boş ise true verir, aksi halde false verir

        boolean first = pwd.isEmpty();
        System.out.println("first = " + first);

        //isBlank() metodu space karakterleri ve hiçlik için true verir
        //bu nedenle isBlank() isEmpty() metodunun sonucunu kapsar


        //isBlank() metodu sadece space içeren stringler için true verir. Space dışında bir karakter içerirse false verir.

        boolean second = pwd.isBlank();
        System.out.println(second);

        boolean third = pwd.trim().equals(pwd);// başından ve sonundan space karakterleri trim() metodu ile kırpıldığında kendisine tekrar eşitse başta ve sonda boşluk yok demektir eğer eşit değilse başta ve sonda boşluk var demektir.
        System.out.println("third = " + third);

        if (first){
            System.out.println("Parola boş bırakılamaz!!");
        }
        if (second){
            System.out.println("Parolada boşluk haricinde görünür karakterlerde bulunmalıdır!!");
        }
        if (!third){
            System.out.println("Parolanın başında ve sonunda space karakteri bulunamaz!!");
        }
    }
}
