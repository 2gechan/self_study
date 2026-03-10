package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            if (cmd.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (cmd.equals("pop")) {
                sb.append(!stack.isEmpty() ? stack.pop() : -1).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (cmd.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }

        }
        System.out.println(sb.toString());
    }
}
