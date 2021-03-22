package pl.kowalczyk.codility;

public class Zad_3_1 {

    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;
        System.out.println(solution(X, Y, D));
    }


    public static int solution(int X, int Y, int D) {
        int distance = Y - X;
        int numberOfJumps = distance / D;
        if (distance % D == 0) {
            return numberOfJumps;
        }

        return numberOfJumps + 1;
    }

}
