package day11mutidimansionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }
        int idx=0;
        for (int[] w:numbers){
            idx+=w.length;
        }
        int[] newArray = new int[idx];

        int i=0;
        for (int[] w:numbers
             ) {
            for (int k:w
                 ) {
                newArray[i] =k;
                i++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
