package UsageOOP;


public class RectangleOOP {

    public static final String Name = "rectangle";
    private int width, height;

    public RectangleOOP(){
        width = 10;
        height = 5;
    }

    public static RectangleOOP Combine (RectangleOOP r1, RectangleOOP r2){
        return new RectangleOOP(r1.width+r2.width, r1.height+r2.height);
    }

    public RectangleOOP (int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
