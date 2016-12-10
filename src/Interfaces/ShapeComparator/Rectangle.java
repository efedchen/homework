package Interfaces.ShapeComparator;

/*Create a list with a shapes, Make a class comparator that will ascend the areas*/

public class Rectangle implements Comparable{

    private int area;

    public int getArea() {
        return area;
    }

    public Rectangle(int area){
        this.area = area;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle r = (Rectangle)o;
        if(area<r.area)
            return -1;
        if(area==r.area)
            return 0;
        if(area>r.area)
            return 1;
        return 0;
    }

    public String toString (){
        return "The area is: "+ area;
    }

}
