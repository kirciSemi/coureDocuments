package day19oop;

public class HondaRunner {
    public static void main(String[] args) {
        Civic civic = new Civic();
        civic.cool();
        Accord accord = new Accord();
        accord.cool();
        System.out.println("Security.price = " + Security.price);
        civic.eco();
        Engine.stop();
        //Lambda Expression
        Engine e =()-> System.out.println("Start");
        e.run();
    }
}
