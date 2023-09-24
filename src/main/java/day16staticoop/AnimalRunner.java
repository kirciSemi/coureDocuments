package day16staticoop;

public class AnimalRunner {
    public static void main(String[] args) {
        Bird brd = new Bird();
        brd.tweet();
        brd.eat();
        brd.drink();

        Dog dg = new Dog();
        dg.bark();
        dg.eat();
        dg.drink();
    }
}
