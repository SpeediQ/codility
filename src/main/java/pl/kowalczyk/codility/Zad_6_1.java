package pl.kowalczyk.codility;

import java.util.Set;
import java.util.TreeSet;

public class Zad_6_1 {

    public static void main(String[] args) {

        int[] A = {2, 1, 1, 2, 3, 1};

        System.out.println(solution(A));


    }

    public static int solution(int[] A) {
        Set<Integer> set = new TreeSet<>();
        for (int i : A) {
            set.add(i);
        }

        return set.size();
    }


}
