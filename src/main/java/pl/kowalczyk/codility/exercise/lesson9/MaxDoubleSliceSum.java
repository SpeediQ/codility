package pl.kowalczyk.codility.exercise.lesson9;

import java.util.Arrays;

public class MaxDoubleSliceSum {
    public static void main(String[] args) {
        int[] A = new int[8];
        A[0] = 3;
        A[1] = 2;
        A[2] = 6;
        A[3] = -1;
        A[4] = 4;
        A[5] = 5;
        A[6] = -1;
        A[7] = 2;

//        double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
//        double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
//        double slice (3, 4, 5), sum is 0.

        System.out.println(Arrays.toString(A));
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int previousSum = A[1];
        int currentSum;
        int maxSum = A[1];
        int minValue = A[1];

        if (A.length <= 3) {
            return 0;
        }
        for (int i = 2; i < A.length - 1; i++) {

            //set minValue
            if (A[i] < minValue) {
                minValue = A[i];
            }

            //compute currentSum
            currentSum = previousSum + A[i];

            //compute maxSum
            if (maxSum < currentSum - minValue) {
                maxSum = currentSum - minValue;
            }

            //set new previousSum for next loop
            previousSum = currentSum;

            //if single current value is bigger then current maxSum
            if (A[i] > maxSum) {
                maxSum = A[i];
            }

            //reset previousSum and minValue
            if (currentSum < A[i]) {
                previousSum = A[i];
                minValue = A[i];
            }
        }

        //return sum but no less then 0
        return Math.max(maxSum, 0);
    }
}
