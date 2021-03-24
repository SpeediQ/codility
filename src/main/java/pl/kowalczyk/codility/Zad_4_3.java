package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_4_3 {

//    Task Score = 77% (Correctness 100% ; Performance 60%) - to do: 100/100

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(solution(5, A)));
    }


    public static int[] solution(int N, int[] A) {
        int maxValue = 0;
        int specialValue_setMaxValue = N + 1;
        int index;
        int[] solutionArray = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] != specialValue_setMaxValue) {
                index = A[i]-1;
                solutionArray[index]++;
                if (solutionArray[index] > maxValue) {
                    maxValue = solutionArray[index];
                }

            } else {
                for (int j = 0; j < N ; j++) {
                    solutionArray[j] = maxValue;
                }
            }
        }
        return solutionArray;


    }
}
