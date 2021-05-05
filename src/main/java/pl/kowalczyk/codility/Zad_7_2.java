package pl.kowalczyk.codility;

import java.util.Arrays;
import java.util.Stack;

public class Zad_7_2 {
    // Array A contains: size_fish  (unique)
    // Array B contains: director_fish (0 - upstream, 1 - downstream)

    public static void main(String[] args) {
        int[] A = new int[]{4, 3, 2, 1, 5};
        int[] B = new int[]{0, 1, 0, 0, 0};

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int count = A.length;

        for (int i = 0; i < A.length; i++) {
            if (B[i]==1){
                stack.push(A[i]);
            }
            if (B[i]==0){
                while (!stack.isEmpty()){
                    if (stack.peek()>A[i]){
                        count--;
                        break;
                    } else if(stack.peek()<A[i]){
                        count--;
                        stack.pop();
                    }
                }
            }


        }

        // write your code in Java SE 8
        return count;
    }

}
