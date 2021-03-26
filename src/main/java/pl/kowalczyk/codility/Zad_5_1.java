package pl.kowalczyk.codility;

public class Zad_5_1 {

    public static void main(String[] args) {
        int A = 0, B = 0, K = 11;
        System.out.println(solution(A, B, K));
    }

    public static int solution(int A, int B, int K) {
        int count = 0;
        int firstValue = 0;
        if (A == B) {
            if (A % K == 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (B <= A + K - 1) {
            for (int i = A; i <= B; i++) {
                if (i % K == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        } else {
            for (int i = A; i <= A + K - 1; i++) {
                if (i % K == 0) {
                    firstValue = i;
                    break;
                }
            }
        }
        int distance = B - firstValue;
        count = distance / K + 1;

        return count;
    }

}
