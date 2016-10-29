package Inheritance.homework.ShapeHierarchy;

public abstract class Shape {
    protected double area;
    double calcArea;
    public Shape(){
        System.out.println("Shape class constructor");
    }
    public void areaCalc (){
        System.out.println("Calculating the area of the triangle");
        shapeArea(calcArea);
    }
    public double shapeArea(double calcArea){
        this.calcArea = calcArea;
        return area= Math.pow(calcArea,2);
    }
}
