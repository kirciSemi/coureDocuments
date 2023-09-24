package day23exception;

public class E03 {
    /*
        1) Exception olsada olmasa da calistirilmasi gereken kodlar var ise eger "finally block" icine yazariz
        2) Database ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir
        İste bu tarz kodlari finally block icine koyariz
        3) try tek basina kullanilamaz, try + 1 catch olur  - try + cok catch olur
            try ile coklu catch ve finally block kullanilabilir
        4) coklu finally block kullanilamaz

         */
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        int[] c = {3,5,7,9};
        getNumberFromIntArray(c,a,b);
    }
    public static void getNumberFromIntArray(int[] c, int a, int b){
        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        /*catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the Database");
        }*/
    }
}
