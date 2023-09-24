package day17oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat =new Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();
        System.out.println(Long.MAX_VALUE);
        int harf = 'a';
        System.out.println("harf = " + harf);
        System.out.println('a'+'b');
        char harf1 = 'b';
        System.out.println("harf1 = " + harf1);
        System.out.println('b' > 'B');
        System.out.println('a' + 0);
        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());

    }
}
