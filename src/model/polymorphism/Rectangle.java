package model.polymorphism;

public class Rectangle implements Shape{
    private double uzunluk;
    private double genislik;

    @Override
    public double areaCalculate() {
        return uzunluk*uzunluk;
    }

    public Rectangle(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }
}
