package Codility.BugfixingLeader;


public class BugFixingLeaderTest {
    public static void main(String[] args) {
        int [] a1 = {4,2,2,3,2,4,2,2,6,4};
        int [] a2 = {4,2,2,2,2,4,2,2,6,4,2,2};
        int [] a3 = {1,1,1,50,1,1};
        int [] a4 = {4,4,1,50,1,1,1,1,1,1,1};
        int [] a5 = {4,4,4,50,4,9,9,9,9,9,9};

        System.out.println(solutionLead(a1));
        System.out.println(solutionLead(a2));
        System.out.println(solutionLead(a3));
        System.out.println(solutionLead(a4));
        System.out.println(solutionLead(a5));
    }
    public static int solutionLead(int [] A){
        int prevCount = 0;
        int prevContainer = 0;
        int currContainer = 0;
        for (int i = 0; i < A.length; i++) {
            int currCount = 1;

            for (int j = i+1; j < A.length; j++) {
                if(A[i]==A[j]){
                    currCount++;
                    currContainer = i;
                }
            }
            if(currCount>prevCount) {
                if(A[currContainer]!=A[prevContainer]||prevContainer==currContainer){
                    prevCount = currCount;
                    prevContainer = currContainer;
                }
            }
        }
        if(prevCount>A.length/2)
            return A[prevContainer];
        else
        return -1;
    }
}
