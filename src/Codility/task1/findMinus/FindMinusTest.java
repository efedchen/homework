package Codility.task1.findMinus;

public class FindMinusTest {
    public static void main(String[] args) {
        int [] t = {2,1,3,4,5,-1,1,3,1};
        int x = findMinus(t);
        System.out.println(x);
    }
    public static int findMinus(int [ ] a){
        int temp;
        int iter=0;
        temp = a[0];
        for (int i = temp; i < a.length; i++) {
            iter++;
            if (a[i]==-1)break;
        }
        return iter;
    }
}
