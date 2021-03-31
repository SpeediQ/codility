package pl.kowalczyk.codility;

public class Zad_5_3 {

    public static void main(String[] args) {

        int[] A = {-3, -5, -8, -4, -10};

        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        int startingPosition = Integer.MAX_VALUE;
        int tempStartingPosition = Integer.MAX_VALUE;
        double tempAvg = Integer.MAX_VALUE;
        double minAvg = Integer.MAX_VALUE;

        if (A.length > 2) {
            double leftAvg = Integer.MAX_VALUE;
            double rightAvg = Integer.MAX_VALUE;
            double averageOfThree = Integer.MAX_VALUE;

            for (int i = 1; i < A.length - 1; i++) {
                leftAvg = (double) (A[i - 1] + A[i]) / 2;
                rightAvg = (double) (A[i + 1] + A[i]) / 2;
                averageOfThree = (double) (A[i - 1] + A[i] + A[i + 1]) / 3;

//                System.out.println("dane wejściowe " + A[i - 1] + "|" +A[i] + "|" +A[i + 1] + " ||| średnie: " + leftAvg + " | " + rightAvg + " | " + averageOfThree);
                if (leftAvg > averageOfThree && rightAvg > averageOfThree) {
                    tempAvg = averageOfThree;
                    tempStartingPosition = i - 1;
                } else if (leftAvg < rightAvg) {
                    tempAvg = leftAvg;
                    tempStartingPosition = i - 1;
                } else if (rightAvg < leftAvg) {
                    tempAvg = rightAvg;
                    tempStartingPosition = i;
                } else {
                    System.out.println("sth wrong!");
                }

                if (tempAvg < minAvg) {
                    minAvg = tempAvg;
                    startingPosition = tempStartingPosition;
                }


            }

        } else {
            return 0;
        }
        System.out.println(minAvg);

        return startingPosition;
    }


}
