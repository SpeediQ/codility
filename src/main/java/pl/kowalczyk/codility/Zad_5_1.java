package pl.kowalczyk.codility;

public class Zad_5_1 {

    public static void main(String[] args) {
        int A = 0, B = 0, K = 11;
        System.out.println(solution(A, B, K));
    }

    public static int solution(int A, int B, int K) {

        if (B < K) {
            if (A != 0) {
                return 0;

            } else {
                return 1;

            }
        } else if (A == B) {
            if (A % K == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        int firstValue = 0;

        if (A + K - 1 <= B) {
            for (int i = A; i <= A + K - 1; i++) {
                if (i % K == 0) {
                    firstValue = i;
                    break;
                }
            }
        } else {
            for (int i = A; i <= B; i++) {
                if (i % K == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        int distance = B - firstValue;
        count = distance / K + 1;


        return count;
    }

}
