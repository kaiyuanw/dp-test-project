package edu.utexas.ece;

public class Bird extends Animal implements Flyable {
    public Bird() {
        super();
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String say() {
        return "Biu";
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public int speed() {
        return 10;
    }

    @Override
    public int height() {
        return 1000;
    }
}
