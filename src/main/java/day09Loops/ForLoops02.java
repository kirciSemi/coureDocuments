package day09Loops;

public class ForLoops02 {

    public static void main(String[] args) {
            //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
                    //

        double num = 28.587;
        String sNum = String.valueOf(num);

        //Stringe çevirmiş olduğumuz sayıyı split metodu ile bölebiliriz.
        String decimalPart = (sNum.split("[.]")[1]);

        //String tipinde olan decimalPart uzerinde matematiksel islem yapabilmek için int e cevirmeliyiz
        int intDecimalPart = Integer.valueOf(decimalPart);
        int sum = 0;
        for (int i = intDecimalPart; i > 0  ; i/=10) {
            sum = sum + i%10;
        }
        System.out.println(sum);

    }
}
