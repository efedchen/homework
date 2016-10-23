package UsageOOP;


public class UsageOOP {
    public static void main(String[] args) {

        //u can access field Name w/o creating an object of the rectangleOOP class
        //there is only one 'copy' of a static field/method in a program
        String name = RectangleOOP.Name;
        System.out.println(name);

        RectangleOOP rectangle1 = new RectangleOOP();
        RectangleOOP rectangle2 = new RectangleOOP(15,15);

        System.out.println("Height of the first rectangle is: " + rectangle1.getHeight());
        System.out.println("And width is: " + rectangle1.getWidth());
        System.out.println("Height of the second rectangle is: " + rectangle2.getHeight());
        System.out.println("And width is: " + rectangle2.getWidth());

        RectangleOOP r3 = RectangleOOP.combine(rectangle1, rectangle2);
        System.out.println("Dimensions of the new, combined rectangle is: " + r3.getHeight()
                + "x" + r3.getWidth());

        r3.setHeight(23);
        r3.setWidth(14);
        System.out.println("Dimensions of the combined rectangle after the changes: " + r3.getHeight()
                + "x" + r3.getWidth());
    }
}
