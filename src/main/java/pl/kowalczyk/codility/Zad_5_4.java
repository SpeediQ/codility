package pl.kowalczyk.codility;

public class Zad_5_4 {

    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};

        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        int countWest = 0;
        int countEast = 0;

        int pairs = 0;
        int counter = 0;


        for (int i = A.length - 1; i >= 0; i--) {
            counter++;
            if (A[i] == 1) {

                countWest++;

            } else if (A[i] == 0) {
                countEast++;
                pairs += counter - countEast;
                if (pairs > 1000000000) {
                    return -1;
                }
            }
        }

        return pairs;
    }


}
