package Inheritance.homework.ShapeHierarchy;

public class Triangle extends Shape {
    private double trBase;
    private double trHeight;

    public void areaCalc (double trBase, double trHeight){
        this.trBase = trBase;
        this.trHeight = trHeight;

        System.out.println("Calculating the area of the triangle");
        shapeArea(trBase,trHeight);
    }
    public double shapeArea(double trBase, double trHeight){
        return area = (trBase*0.5)*trHeight;
    }
    public Triangle(){

        System.out.println("Triangle class constructor");
    }
}
