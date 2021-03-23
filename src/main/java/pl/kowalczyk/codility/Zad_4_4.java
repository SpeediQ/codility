package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_4_4 {

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }

        return 1;
    }

}
