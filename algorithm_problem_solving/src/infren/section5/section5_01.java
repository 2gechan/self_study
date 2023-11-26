package infren.section5;

import java.util.Scanner;
import java.util.Stack;

// stack을 이용한 괄호 짝이 맞는지 찾기
public class section5_01 {
    static String solution(String t) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : t.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        solution(t);
    }
}
