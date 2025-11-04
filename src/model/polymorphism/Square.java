package model.polymorphism;

public class Square implements Shape{

    private double kenar;
    @Override
    public double areaCalculate() {
        return 1;
    }

    public Square(double kenar) {
        this.kenar = kenar;
    }
}
