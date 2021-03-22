package pl.kowalczyk.codility;

import java.util.Arrays;

public class Zad_3_2 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        System.out.println(solution(arr));
        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("A["+i+"] = " + arr[i]);
        }
    }


    public static int solution(int[] A) {
        Arrays.sort(A);
        int missingValue;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i +1){
                if (i == 0){
                    return 1;
                }else {
                    return A[i - 1] + 1;
                }
            } else {
                if (i == A.length-1){
                    return A[i]+1;
                }
            }
        }

        return 1;
    }

}
