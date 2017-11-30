package edu.utexas.ece;

public class Fish extends Animal implements Swimmable {
    public Fish() {
        super();
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String say() {
        return "Bulo";
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public int speed() {
        return 2;
    }

    @Override
    public int depth() {
        return -10;
    }
}
