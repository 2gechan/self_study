package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17413 {
    static String solution(String line) {

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == '>') {
                sb.append(c);
                flag = false;
                continue;
            }
            if (flag) {
                sb.append(c);
                continue;
            }
            if (c == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c);
                flag = true;
                continue;
            }
            if (c == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            else stack.push(c);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(solution(line));
    }
}
