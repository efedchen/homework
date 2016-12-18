package Exceptions.examples;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(doJob());
    }
    public static int doJob(){
        int res=0;
        try {
            res = doSqr(-1);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
    public static int doSqr(int a) throws Exception{
        System.out.println("Taking the root...");
        return sqr(a);
    }
    public static int sqr(int a) throws Exception{
        if (a<0)
            throw new Exception("check input number");
        return (int)Math.sqrt(a);
    }
}
