package day22map_exception;

public class E03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,6);

    }
    public static void getCharFromString(String s, int idx){
        try {
            char ch =s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            //serr consola yazılan yazının kırmızı olmasını sağlar.
            System.err.println("Girilen index değeri " + idx +" sınırların dışında.\nGirilebilecek maximum index "+(s.length()-1)+" değerini geçmemeli");
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }


    }
}
