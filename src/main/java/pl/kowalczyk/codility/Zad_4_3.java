package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_4_3 {

//    Task Score = 77% (Correctness 100% ; Performance 60%) - to do: 100/100

    public static void main(String[] args) {
        int[] A = {2, 3, 6, 5, 4, 8};
        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        Arrays.sort(A);
        int previousValue = Integer.MIN_VALUE;
        boolean moreThenZero = false;
        if (A[0] > 1) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && !moreThenZero) {
                previousValue = A[i];
                moreThenZero = true;
                if (A[i] == 1 && i == A.length - 1) {
                    return A[i] + 1;
                }

            } else if (A[i] > 0) {
                if (A[i] - previousValue > 1) {
                    return previousValue + 1;
                } else if (i == A.length - 1) {
                    return A[i] + 1;
                }

                previousValue = A[i];
            }
        }

        return 1;
    }
}
