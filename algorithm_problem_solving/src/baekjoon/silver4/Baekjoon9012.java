package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {

    static String solution(String line) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.size() > 0) stack.pop();
                else return "NO";
            }
        }
        if (stack.size() > 0) return "NO";

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            String result = solution(line);
            sb.append(result + "\n");
        }
        System.out.println(sb.toString());
    }
}
