package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            Stack<Character> stack = new Stack<>();
            for (char c : word.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                }
                else stack.push(c);
            }
            if (stack.isEmpty()) cnt++;

        }
        System.out.println(cnt);
    }
}
