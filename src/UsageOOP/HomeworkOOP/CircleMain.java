package UsageOOP.HomeworkOOP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class Circle that returns the area of the circle

public class CircleMain {
    public static void main(String[] args) throws IOException {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        double x = 12.0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Radius of second circle: ");
        String numberStr = bf.readLine();
        double number = Double.valueOf(numberStr);

        System.out.println(circle1.circleArea(x));
        System.out.println(circle2.circleArea(number));
    }
}
