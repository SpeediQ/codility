package pl.kowalczyk.codility;

import java.util.Stack;

public class Zad_7_4 {
    public static void main(String[] args) {
        int[] H = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(solution(H));


    }

    public static int solution(int[] H) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int value : H) {
            while (!stack.isEmpty() && value < stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < value) {
                count++;
                stack.push(value);
            }
        }

        return count;
    }


}
