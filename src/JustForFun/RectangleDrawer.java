package JustForFun;

// class that draws rectangle in the command prompt

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleDrawer {
    public static void main(String[] args) throws IOException {
        RectangleBase rect = new RectangleBase();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the height of the rectangle: ");  //entering the height
        String tempHeight = bf.readLine();

        //checking if the entered value is integer
        while (IsNumeric.IsNumericInt(tempHeight)==false){
            System.out.println("Error! Please, enter the number!");
            tempHeight = bf.readLine();
        }
        //setting the Height of the rectangle
        rect.setHeight(Integer.valueOf(tempHeight));

        System.out.println("Please, enter the width of the rectangle: ");   //entering the width
        String tempWidth = bf.readLine();

        //checking if the entered value is integer
        while (IsNumeric.IsNumericInt(tempWidth)==false){
            System.out.println("Error! Please, enter the number: ");
            tempWidth = bf.readLine();
        }
        //setting the Width of the rectangle
        rect.setWidth(Integer.valueOf(tempWidth));

        //AND FINALLY DRAWING THE rectangle!
        rect.Drawer();
    }
}
