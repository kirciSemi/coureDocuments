package day06switchternarystring;

public class Ternary02 {
    public static void main(String[] args) {
        //Object java da butun Non-primitive (classlarin) ortak parent(baba) idir (==>Hz. Adem gibidir)
        //Object in parenti yoktur.
        //farkli data tipleri icin ortak bir variable olusturmak istediginizde data type olarak object kullaniriz,

        int a = -313;
        a = Math.abs(a);
        String result = (a>99 && a<1000) ?"Üç basamaklıdır":"Üç basamaklı değildir";
        System.out.println(result);

        int year = 2005;
        String result1 = year%100 ==0?year%400==0?"Leap":"Not Leap":year%4==0?"Leap":"Not Leap";
        System.out.println(result1);

    }
}
