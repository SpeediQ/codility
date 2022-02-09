package pl.kowalczyk.codility.exercise.lesson9;

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;

        System.out.println(Arrays.toString(A));
        System.out.println(A[5] - A[4]);

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length <= 1) {
            return 0;
        }

        int minValue = A[0];
        int profit = 0;
        int maxValue = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < minValue) {
                minValue = A[i];
            }

            if (A[i] > minValue) {
                profit = Math.max((A[i] - minValue), profit);
            }

            if (maxValue < profit) {
                maxValue = profit;
            }

        }
        return maxValue;
    }

}
