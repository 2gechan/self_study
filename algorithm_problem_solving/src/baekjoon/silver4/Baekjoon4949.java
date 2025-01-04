package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon4949 {

    static String solution(String line) {
        String answer = "yes";
        Stack<Character> stack = new Stack<>();

        for (char c : line.toCharArray()) {
            if (c == '(' || c == '[') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                stack.pop();
            }
            else if(c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "no";

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;
            String answer = solution(line);
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
}
