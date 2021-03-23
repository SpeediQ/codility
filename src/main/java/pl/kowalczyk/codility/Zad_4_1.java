package pl.kowalczyk.codility;

import java.util.*;

public class Zad_4_1 {

    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        Set<Integer> availableFields = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            availableFields.add(A[i]);
            if (availableFields.size() == X){
                return i;
            }
        }

        return -1;
    }

}
