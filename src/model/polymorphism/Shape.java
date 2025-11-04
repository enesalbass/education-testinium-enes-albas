package model.polymorphism;

public interface Shape {
    double areaCalculate();

    default double volumeCalculate(){
        return areaCalculate();
    }
}
