package UsageOOP.HomeworkOOP;


//class Circle that returns the area of the circle


public class Circle {
    private static double radius;
    private double area;

    public Circle() {}

    public Circle (double radius){
        this.radius = radius;
    }

    public double CircleArea (double radius){
       return area = Math.pow(radius,2) * Math.PI;
    }
    public double CircleArea (){
        return area = radius * 2 * Math.PI;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }
}
