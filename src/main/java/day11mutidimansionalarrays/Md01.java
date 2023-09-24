package day11mutidimansionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Bir Arrayin elemanları Array ise bu Arrayler Multdimensional Array olarak adlandırılır
        //Multidimensional Array oluşturma

        int[][] a = new int[3][2];
        //([[0,0][0,0][0,0]]) oluşur
        //int[][] a = {{5,12},{81,45},{123,0}};
        a[0][0] = 1;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        //Muidtidimensional arrayleri consola yazdırma
        System.out.println(Arrays.toString(a));//[[I@58ceff1, [I@7c30a502, [I@49e4cb85] iç arraylerin referans değerlerini yazıyor.
        //Multidimensional arrayi consola yazdırırken deepToString() metodu kullanılır.
        System.out.println(Arrays.deepToString(a));


        //Üç boyutlu arrary
        int[][][] b = {{{12,3},{34,67}},{{36,78},{56}}};

        System.out.println(Arrays.deepToString(b));
        System.out.println(b[0][1][0]);

        String[][] students = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyahan","Burhan"}};
        System.out.println(Arrays.deepToString(students));
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        System.out.println(students.length);
        int sum = 0;
        for (String[] w:students) {
            sum+=w.length;
        }
        System.out.println(sum);
        for (String[] w:students) {
            for (String k:w) {
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }
    }


}
