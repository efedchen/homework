package Codility.DemoTest;

//got only 35% [correctness 26, performance 54]

public class CodilityDemoTest {
    public static void main(String[] args) {
        int [] intArray1 = {-1,-2,-3,0,-1,-2,-3};
        int [] intArray2 = {1,4,3,-6,-6,-4,-4};
        int [] intArray3 = {-1,3,-4,5,1,-6,2,1};
        int [] intArray4 = {0,3,-4,5,1,-5,2,1};
        int [] intArray5 = {3,3,-4,5,1,-5,2,1};
        int [] intArray6 = {0,0,0,0,0,0,0,0,0,0,0};
        int [] intArray7 = {1,2,1,0,-2,5};
        int [] intArray8 = {1,0,-1,-3,5,0};


        System.out.println("position of equilibrium numb at 1 (4): " + solution(intArray1) +
                ". array length: " + intArray1.length);
        System.out.println("position of equilibrium numb at 2 (6): " + solution(intArray2) +
                ". array length: " + intArray2.length);
        System.out.println("position of equilibrium numb at 3 (2): " + solution(intArray3) +
                ". array length: " + intArray3.length);
        System.out.println("position of equilibrium numb at 4 (2): " + solution(intArray4) +
                ". array length: " + intArray4.length);
        System.out.println("position of equilibrium numb at 5 (-1): " + solution(intArray5) +
                ". array length: " + intArray5.length);
        System.out.println("position of equilibrium numb at 6 (0): " + solution(intArray6) +
                ". array length: " + intArray6.length);
        System.out.println("position of equilibrium numb at 7 (3): " + solution(intArray7) +
                ". array length: " + intArray7.length);
        System.out.println("position of equilibrium numb at 8 (2): " + solution(intArray8) +
                ". array length: " + intArray8.length);
    }

    public static int solution(int[] A) {
        long tmpI = 0;

        int zeroChecker = 0;

        for(int i = 0; i < A.length; i++){
            zeroChecker += A[i];
        }
        if(zeroChecker == 0) return 0;

        for(int i=0; i<A.length;i++){
            if(i==A.length-1)return -1;

            long tmpJ=0;
            tmpI+=A[i];

            for(int j=i+2; j< A.length; j++){
                tmpJ+=A[j];
            }

            if(tmpI==tmpJ){
                return i+1;
            }
        }
        return -1;
    }
}
