package day14loops.day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Bird b1 = new Bird();
        b1.tweet();
        b1.drink();
        b1.eat();
    }

}
