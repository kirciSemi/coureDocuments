package day22map_exception;

public class E04 {


    public static void main(String[] args) {
        String arr[] = {"j","a","v","a"};
        getElementFromArray(arr,5);
    }
    public static void getElementFromArray(String[] s, int idx){
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girilen index "+idx+" sınırların dışında.\nGirilebilecek index "+s.length+" değerinden büyük olamaz");
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
