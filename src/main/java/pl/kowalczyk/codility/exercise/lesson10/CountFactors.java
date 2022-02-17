package pl.kowalczyk.codility.exercise.lesson10;

public class CountFactors {

    public static void main(String[] args) {
//        System.out.println(solution(24));
        System.out.println(solution(1));
    }

    public static int solution(int N) {
        int count = 0;
        int maxValue = N;
        if (N == 1){
            return 1;
        }
        for (int i = 1; i < maxValue; i++) {
            maxValue = N / i;

            if (N % i == 0) {
                if (N / maxValue != N / i){
                    count++;
                }
                count++;
            }
        }
        return count;
    }
}
