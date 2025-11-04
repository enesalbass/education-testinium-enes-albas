package model.abstractions;

public class Cat extends model.abstractions.Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + "Miyavlıyor...");
    }
}