package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String line = br.readLine();

            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (char c : line.toCharArray()) {
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!flag) sb.append("NO").append("\n");
            else if (stack.isEmpty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb.toString());
    }
}
