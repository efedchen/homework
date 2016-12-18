package Exceptions.examples;

public class ExcpQueue {
    public static void main(String[] args) {
        divide(10,20,30);
    }
    public static void divide (int fInt,int sInt,int tInt){
        try {
            int a[] = new int[2];
            a[0] = fInt / 2;
            a[1] = sInt / 2;
            a[2] = tInt / 0;
//        }
        }catch (ArithmeticException aE){
            System.out.println("Dividing by zero!");
        }
        //that point not even be reached,
        //because previous exception - arithmetic will stop the program
        catch (IndexOutOfBoundsException outE){
            System.out.println("Check your array bounds!");
        }
        System.out.println("hi");
    }
}
