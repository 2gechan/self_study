package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            String command = line[0];
            if (command.equals("push")) stack.push(Integer.valueOf(line[1]));
            else if (command.equals("pop")) {
                if (stack.size() > 0) sb.append(stack.pop() + "\n");
                else sb.append(-1 + "\n");
            }
            else if (command.equals("size")) sb.append(stack.size() + "\n");
            else if (command.equals("empty")) {
                if (stack.size() == 0) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            }
            else {
                if (stack.size() > 0) sb.append(stack.peek() + "\n");
                else sb.append(-1 + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}
