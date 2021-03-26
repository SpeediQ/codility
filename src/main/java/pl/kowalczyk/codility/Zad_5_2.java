package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_5_2 {

    public static void main(String[] args) {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        String S = "CAGCCTA";
        System.out.println(Arrays.toString(solution(S, P, Q)));


    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] arraySolution = new int[P.length];
        int minValue;
        int currentValue = Integer.MAX_VALUE;
        char currentChar;
        for (int i = 0; i < P.length; i++) {
            int A = P[i];
            int B = Q[i];
            minValue = Integer.MAX_VALUE;
            for (int j = A; j <= B; j++) {
                currentChar = S.charAt(j);
                if (currentChar == 'A') {
                    currentValue = 1;
                } else if (currentChar == 'C') {
                    currentValue = 2;
                } else if (currentChar == 'G') {
                    currentValue = 3;
                } else if (currentChar == 'T') {
                    currentValue = 4;
                } else {
                    System.out.println("Error");
                    return null;
                }

                if (currentValue < minValue) {
                    minValue = currentValue;
                }
            }
            arraySolution[i] = minValue;

        }

        return arraySolution;
    }

}
