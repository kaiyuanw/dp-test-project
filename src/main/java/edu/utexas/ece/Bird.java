package edu.utexas.ece;

public class Bird extends Animal {
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
}
