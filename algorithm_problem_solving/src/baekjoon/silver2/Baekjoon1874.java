package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (n-- > 0) {

            int value = Integer.valueOf(br.readLine());

            if (value > start) {

                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                    }
                    start = value;
            } else if (stack.peek() != value) {
                sb = new StringBuilder("NO");
                break;
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb.toString());

    }
}
