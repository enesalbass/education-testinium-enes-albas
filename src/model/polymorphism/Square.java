package model.polymorphism;

public class Square implements Shape{

    private double kenar;
    @Override
    public double areaCalculate() {
        return kenar*kenar;
    }

    public Square(double kenar) {
        this.kenar = kenar;
    }
}
