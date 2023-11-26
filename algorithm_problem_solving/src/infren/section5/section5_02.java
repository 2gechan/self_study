package infren.section5;

import java.util.Scanner;
import java.util.Stack;

// stack을 이용한 괄호안에 들어있지 않은 문자 출력하기
public class section5_02 {
    static String solution(String t) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : t.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') stack.pop();
            else if (stack.isEmpty()) sb.append(c);
        }
        String answer = new String(sb);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }기
}
