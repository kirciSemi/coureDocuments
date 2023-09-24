package day17oop;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
    @Override
    public void drink(){
        System.out.println("Cat drink");
    }
}
