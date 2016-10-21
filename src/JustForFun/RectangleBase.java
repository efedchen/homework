package JustForFun;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RectangleBase {
    private int width;
    private int height;

    public RectangleBase (){}

    public void Drawer() {

        //loop that draws the upper line if the rectangle
                for (int i = 0; i < width; i++) {
                    System.out.print("-");
                }
        System.out.println(); //move the carriage downside

        //creates the inner space of rectangle
        StringBuffer tempBuffer = new StringBuffer();
        for (int i = 0; i < width-2; i++) {
          tempBuffer.append(" ");
        }

        //side walls of the rectangle
        for (int j = 0; j < height; j++) {
            System.out.print("|"+tempBuffer+"|");
            System.out.println();
        }

        //draws the bottom line
                for (int i = 0; i < width; i++) {
                    System.out.print("-");
                }
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*   array cant be used in that case, because output of the method "Arrays.toString"
             is value with comma. So the concatenation of String is better
        //creates the array that contains the inner space of rectangle
        String [] tempArray = new String[width-2];
                for (int i = 0; i < width-2; i++) {
                    tempArray[i]=" ";
                }

        //side walls of the rectangle
                for (int j = 0; j < height; j++) {
                    String tempStr = Arrays.toString(tempArray);
                    System.out.print("|"+tempStr+"|");
                    System.out.println();
                }
        */
}
