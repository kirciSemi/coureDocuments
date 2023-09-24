package day11mutidimansionalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int min = ages[0][0];
        int max = ages[0][0];

        for (int[] w : ages) {
            for (int k : w) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
        }
        System.out.println(max + min);
    }
}

