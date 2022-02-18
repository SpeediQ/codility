package pl.kowalczyk.codility.lesson10;

public class MinPerimeterRectangle {

    public static void main(String[] args) {
//        System.out.println(solution(24));
        System.out.println(solution(2));
    }

    public static int solution(int N) {
        int maxValue = N;
        int tempResult;
        int result = 2 * (N + 1);

        if (N == 1) {
            return 4;
        }
        for (int i = 1; i < maxValue; i++) {
            maxValue = N / i;

            if (N % i == 0) {
                int valueA = i;
                int valueB = valueA;

                if (N / maxValue != N / i) {
                    valueB = N / valueA;
                }
                tempResult = 2 * (valueA + valueB);

                if (tempResult < result) {
                    result = tempResult;
                }
            }
        }

        return result;
    }
}
