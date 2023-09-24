package day11mutidimansionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int[] numbers = {1, 2, 3, 0, 12, 1};
        int[] tempnums = new int[numbers.length];
        int idx = 0;
        for(int i = 0; i<tempnums.length;i++){
            tempnums[i]=1;
        }
        for (int w:numbers){
            if(w!=1) {
                tempnums[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(tempnums));



        //iki arrayin esit olabilmesi icin ayni indexte ayni elemanlarin bulunmasi gerekir

        int [] arr =new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=3;

        int [] brr =new int[3];
        brr[0]=2;
        brr[1]=3;
        brr[2]=1;

        boolean result = Arrays.equals(arr,brr);
        System.out.println(result);


    }
}
