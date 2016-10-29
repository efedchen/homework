package Inheritance.homework.ShapeHierarchy;

public class Circle extends Rectangle{
    private double rad;
    public Circle(){
        System.out.println("this is circle class");
    }

    public double shapeArea(double r) {
        this.rad = r;
        return area = Math.PI*Math.pow(r,2);
    }
}
