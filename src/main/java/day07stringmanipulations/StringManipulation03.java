package day07stringmanipulations;

public class StringManipulation03 {

    public static void main(String[] args) {
        //Example  Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht


        //lastIndexOf("m") ==> m' nin Stringdeki son görünümünün indexini veriyor
        String s ="mehmet";


        //s.indexOf("m") ==>0   farkli ise tekrarli
        //s.lastIndexOf("m") ==>3

        //s.indexOf("e") ==>1
        //s.lastIndexOf("e") ==>4

        //s.indexOf("h") ==>2   ayni ise tekrarsiz
        //s.lastIndexOf("h") ==>2

        //s.indexOf("t") ==>5
        //s.lastIndexOf("t") ==>5


        if (s.indexOf("m")==s.lastIndexOf("m")){
            System.out.print("m");
        }
        if (s.indexOf("e")==s.lastIndexOf("e")){
            System.out.print("e");
        }
        if (s.indexOf("h")==s.lastIndexOf("h")){
            System.out.print("h");
        }
        if (s.indexOf("t")==s.lastIndexOf("t")){
            System.out.print("t");
        }
        System.out.println();
        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cartNum ="1234 6789 1234 6789";
        String first01 = cartNum.split(" ")[0].replaceAll("[0-9]","*")+" "+ cartNum.split(" ")[1].replaceAll("[0-9]","*")+" "+cartNum.split(" ")[2].replaceAll("[0-9]","*")+" "+cartNum.split(" ")[3];
        System.out.println(first01);

        //ve ya
        String first = cartNum.substring(0, 15).replaceAll("[0-9]", "*");
        String last = cartNum.substring(15);

        System.out.println(first + last);
        String result1= first+ last;
        System.out.println("result1 = " + result1);//result1 = **** **** **** 6789

        String result2= first.concat(last);
        System.out.println("result2 = " + result2);//result2 = **** **** **** 6789
    }
}
