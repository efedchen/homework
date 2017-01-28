package Codility.PrefixSet;

//got 80 percent [100 correctness, 68 performance]

public class PrefixSet {
    public static void main(String[] args) {

        int [] A1 = {1,2,3,4,2,6,0,1,2,3,4};
        int [] A2 = {2,2,1,0,1};
        int [] A3 = {6,2,2,1,0,1};
        int [] A4 = {6};
        int [] A5 = {6,6};

        System.out.println(solutionTask2(A1));
        System.out.println(solutionTask2(A2));
        System.out.println(solutionTask2(A3));
        System.out.println(solutionTask2(A4));
        System.out.println(solutionTask2(A5));
     }
     public static int solutionTask2 (int [] A){
         for (int i = A.length-1; i >= 0; i--) {
             int iter = 0;
             int tempJ = 0;
             for (int j = i-1; j >= 0; j--) {
                 tempJ = i;
                 if(A[i]==A[j]){
                     iter++;
                 }
             }
             if(iter==0)return tempJ;
         }
         return -1;

//         second way:
//        int n = A.length;
//        int p = n - 1;
//        int i = p - 1;
//        while(i>=0){
//            while (i>0&&(A[i]!=A[p])){
//                i = i-1;
//            }
//            if(A[i] == A[p]){
//                p = p -1;
//                i = p - 1;
//            }else i = -1;
//        }return p;
     }
}
