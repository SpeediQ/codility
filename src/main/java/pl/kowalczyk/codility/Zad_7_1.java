package pl.kowalczyk.codility;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Zad_7_1 {
    public static void main(String[] args) {
        System.out.println(solution("{{{{"));
        System.out.println(solution("{([][])}"));
        System.out.println(solution("{[()()][()]}"));
        System.out.println(solution("{[(12332112)(42343243)][(312321)]}"));

    }

    public static int solution(String S) {
//        Deque<Character> stack = new ArrayDeque<Character>();
        Stack<Character> stack = new Stack<Character>();
        char lestChar;


        if (S.isEmpty()) {
            return 1;
        }

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                stack.push(currentChar);
                continue;
            }
            if (stack.isEmpty()) {
                return 0;
            }

            if (currentChar == '}') {
                lestChar = stack.pop();
                if (lestChar == '[' || lestChar == '('){
                    return 0;
                }
            } else if (currentChar == ']') {
                lestChar = stack.pop();
                if (lestChar == '{' || lestChar == '('){
                    return 0;
                }
            } else if (currentChar == ')') {
                lestChar = stack.pop();
                if (lestChar == '{' || lestChar == '[') {
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()){
            return 0;
        }


        return 1;

    }

}
