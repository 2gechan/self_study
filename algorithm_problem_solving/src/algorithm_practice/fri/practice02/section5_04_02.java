package algorithm_practice.fri.practice02;

import java.util.Scanner;
import java.util.Stack;

public class section5_04_02 {
    static int solution(String tc) {
        int answer = 0;
        Stack<String> stack = new Stack<>();

        for (char c : tc.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(String.valueOf(c));
            }
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int result = 0;
                if (c == '+') {
                    result = b + a;
                } else if (c == '-') {
                    result = b - a;
                } else if (c == '*') {
                    result = b * a;
                } else if (c == '/'){
                    result = b / a;
                }
                stack.push(String.valueOf(result));
            }
        }
        answer = Integer.valueOf(stack.pop());

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
