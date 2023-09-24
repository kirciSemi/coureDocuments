package day12arraylist;

public class MethoCreation01 {
    public static void main(String[] args) {
        int sum = toplamaYap(13,14,15,23,54);
        System.out.println(sum);
    }
    //ornek 1 :toplama islemi yapan bir method olusturunuz


    public static int toplamaYap(int ... a){
        int toplam=0;
        for (int b :
                a) {
            toplam+=b;
        }
        return toplam;
    }


}
