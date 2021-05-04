package pl.kowalczyk.codility;

public class Zad_6_3 {

    public static void main(String[] args) {

//        int[] A = new int[6];
//
//        A[0] = 1;
//        A[1] = 5;
//        A[2] = 2;
//        A[3] = 1;
//        A[4] = 4;
//        A[5] = 0;

        int[] A = new int[3];

        A[0] = 1;
        A[1] = 2147483647;
        A[2] = 0;



        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        int count = 0;
        long currentDisc_start = 0;
        long currentDisc_end = 0;
        long nextDisc_start = 0;
        long nextDisc_end = 0;



        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                currentDisc_start = (long)i - (long)A[i];
                currentDisc_end = (long)i + (long)A[i];
                nextDisc_start = (long)j - (long)A[j];
                nextDisc_end = (long)j + (long)A[j];



                if (currentDisc_start <= nextDisc_start && nextDisc_start <= currentDisc_end) {
                    count++;
                } else if (currentDisc_start <= nextDisc_end && currentDisc_start >= nextDisc_start) {
                    count++;
                }


            }
        }
        if (count > 10000000) {
            return -1;
        }
        return count;

    }


}
