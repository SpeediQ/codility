package pl.kowalczyk.codility;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zad_6_3 {

    public static void main(String[] args) {

        int[] A = new int[6];

        A[0] = 1;
        A[1] = 5;
        A[2] = 2;
        A[3] = 1;
        A[4] = 4;
        A[5] = 0;


        System.out.println(solution(A));


    }

    public static int solution(int[] A) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(i - A[i], i + A[i]);
        }

        int previous = 0;
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());

//            if (previous)

        });

        int count = 0;


        return count;
    }


}
