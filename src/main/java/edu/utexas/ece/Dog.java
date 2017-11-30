package edu.utexas.ece;

public class Dog extends Animal {
    public Dog() {
        super();
    }
    
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String say() {
        return "Woof";
    }
}
