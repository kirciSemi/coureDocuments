package day22map_exception;

public class E06 {
    public static void main(String[] args) {
        String s = "Java";
        getNumberOfChars(s);
        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);
    }
    //String in degeri null oludugu zaman string class daki methodlari kullanamazsiniz
    //cunku java NullPointerException atar
    public static void getNumberOfChars(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.out.println("String değeri null olamaz");
            System.err.println(e.getMessage());
        }
    }
}
