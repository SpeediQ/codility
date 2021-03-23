package pl.kowalczyk.codility;

public class Zad_3_3 {
    // A - tablica
    // N - ilość wartości
    // P - wartość

    public static void main(String[] args) {
        int[] A = {-1000, 1000};
        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;

        int sumL = 0;
        int sumR = 0;

        int totalSum = 0;

        for (int value : A) {
            totalSum += value;
        }
        for (int i = 0; i < A.length - 1; i++) {
            sumL += A[i];
            sumR = totalSum - sumL;
            minDiff = Math.min(minDiff, Math.abs(sumL - sumR));

        }
        return minDiff;
    }

}
