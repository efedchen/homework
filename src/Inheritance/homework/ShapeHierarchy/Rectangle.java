package Inheritance.homework.ShapeHierarchy;

public class Rectangle extends Triangle{
    private double height;
    private double width;

    public Rectangle (){
        System.out.println("This is class rectangle");
    }
    public double shapeArea (double h, double w){
        this.height = h;
        this.width = w;

        return area = h*w;
    }

}
