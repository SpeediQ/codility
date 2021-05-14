package pl.kowalczyk.codility;

import java.util.Stack;

public class Zad_8_1 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty() || stack.peek() == A[i]) {
                stack.push(A[i]);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {

            if (A[i] == stack.peek()) {
                count++;
                if (count > A.length / 2) {
                    return i;
                }
            }
        }


        return -1;
    }


}
