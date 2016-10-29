package Inheritance.homework.ShapeHierarchy;

public class MainMeth {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.shapeArea(4.5);
        Rectangle r = new Rectangle();
        r.shapeArea(4.5,5.6);
        Triangle t = new Triangle();
        t.areaCalc(23, 15.6);
    }
}
