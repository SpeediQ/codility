package pl.kowalczyk.codility;

public class Zad_5_1 {

    public static void main(String[] args) {
        int A = 6, B = 11, K = 2;
        System.out.println(solution(A, B, K));
    }

    public static int solution(int A, int B, int K) {
        int count = 0;
        int firstValue = 0;
        for (int i = A; i <= A + K - 1; i++) {
            if (i % K == 0) {
                firstValue = i;
            }

        }


        for (int i = firstValue; i <= B; i += K) {
            if (i % K == 0) {
                count++;
            }
        }

        return count;
    }

}
