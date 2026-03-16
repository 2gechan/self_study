package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();

            if (line.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            boolean flag = true;
            for (char c : line.toCharArray()) {


                if (c == '(') stack.push(c);
                else if (c == ')' ) {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        flag = false;
                        break;
                    }

                }
                else if (c == '[') {
                    stack.push(c);
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    else {
                        flag = false;
                        break;
                    }

                }
            }

            if (stack.isEmpty() && flag) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb.toString());
    }
}
