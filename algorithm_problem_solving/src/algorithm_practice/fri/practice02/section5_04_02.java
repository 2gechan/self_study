package algorithm_practice.fri.practice02;

import java.util.Scanner;
import java.util.Stack;

public class section5_04_02 {
    static int solution(String tc) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < tc.length(); i++) {
            if (tc.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                if (tc.charAt(i - 1) == '(') {
                    answer += stack.size();
                }
                else answer += 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
