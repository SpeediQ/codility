package pl.kowalczyk.codility;

import java.util.HashMap;
import java.util.Map;

public class Zad_8_2 {
    public static void main(String[] args) {
        int[] A = new int[]{4, 3, 4, 4, 4, 2};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        int maxValue = A[0];
        int maxCount = 1;

        for (int i = 0; i < map.keySet().size(); i++) {
            int currentCount = map.get(A[i]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxValue = A[i];
            }
        }

        int leaderValue = 0;
        int leaderCount = 0;

        if (maxCount > (0.5) * A.length) {
            leaderValue = maxValue;
            leaderCount = maxCount;
        } else {
            return 0;
        }

        int leftCount = 0;
        int equiCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaderValue) {
                leftCount++;
            }
            if (leftCount > (0.5) * (i + 1)) {
             int rightCount = leaderCount - leftCount;
             if (rightCount > (0.5) * (A.length - 1 -i)){
                 equiCount++;
             }
            }
        }


        return equiCount;

    }


}
