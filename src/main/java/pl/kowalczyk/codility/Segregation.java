package pl.kowalczyk.codility;

import java.util.Arrays;

public class Segregation {
    public static void main(String[] args) {
        int[] A = new int[]{12, 14, 65, 4, 6, 5, 8, 7, 9, 3, 2, 1};
        int tempValue;
        int count =0;
        for (int j = 0; j < A.length; j++) {
            for (int i = 1; i < A.length-j; i++) {
                count++;
                if (A[i] < A[i - 1]) {
                    tempValue = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = tempValue;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(A));


    }
}
