package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_6_2 {

    public static void main(String[] args) {

        int[] A = {10, 10, 10};

        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        int product = Integer.MIN_VALUE;

        if (A.length == 3) {
            product = 1;
            for (int i : A) {
                product *= i;
            }
        } else if (A.length > 3) {
            Arrays.sort(A);
            /// 3 x bigValue
            int value1 = (A[A.length - 1]) * (A[A.length - 2]) * (A[A.length - 3]);
            /// 2 x lowValue , 1 x bigValue
            int value2 = (A[A.length - 1]) * (A[0]) * (A[1]);
            if (value1 > value2) {
                return value1;
            } else {
                return value2;
            }

        } else {
            System.out.println("less than 3 digits");
        }


        return product;
    }


}
