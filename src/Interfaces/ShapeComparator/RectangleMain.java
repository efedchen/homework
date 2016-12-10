package Interfaces.ShapeComparator;

import java.util.Arrays;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle [] list = {new Rectangle(5), new Rectangle(10), new Rectangle(9), new Rectangle(-2)};
        Arrays.sort(list);
        for(Rectangle r : list){
            System.out.println(r);
        }
    }
}
