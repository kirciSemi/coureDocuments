package day18oop;

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

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }

//    public final double circleArea(double r){
//        return 3.14*r*r;
//    }
}
