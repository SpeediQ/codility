package pl.kowalczyk.codility.lesson9;

import java.util.Arrays;

public class MaxSliceSum {
    public static void main(String[] args) {
        int[] A = new int[2];
        A[0] = -2;
        A[1] = 1;

        System.out.println(Arrays.toString(A));
        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        int previousSum = A[0];
        int currentSum;
        int maxSum = A[0];
        for (int i = 1; i < A.length; i++) {
            currentSum = previousSum + A[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }

            previousSum = currentSum;

            if (currentSum < A[i]) {
                previousSum = A[i];
            }

            if (A[i]>maxSum){
                maxSum = A[i];
            }
        }

        return maxSum;
    }
}
