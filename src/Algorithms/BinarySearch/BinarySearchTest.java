package Algorithms.BinarySearch;

import static java.util.Arrays.binarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        int [] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        int numb1 = 16;
        int numb2 = 10;
        int numb3 = 3;
        System.out.println(binarySearch(array, numb1));
        System.out.println(ownBinarySearch(array, numb1));
        System.out.println(binarySearch(array, numb2));
        System.out.println(ownBinarySearch(array, numb2));
        System.out.println(binarySearch(array, numb3));
        System.out.println(ownBinarySearch(array, numb3));
    }
    public static int ownBinarySearch(int[] array, int numb){
        int start=0;
        int end = array.length-1;

        while (start<=end){
            int mid = (start+end)/2;

            if(numb < array[mid])end = mid - 1;
            else if (numb > array[mid]) start = mid +1;
            else return mid;
        }
        return -1;
    }
}
