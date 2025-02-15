package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String cal = br.readLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.valueOf(br.readLine());
        }
        Stack<Double> stack = new Stack<>();
        int index = 0;
        for (char c : cal.toCharArray()) {

            if (c >= 65 && c <= 90) {
                stack.push((double) nums[c - 'A']);
                index++;
            }
            else {
                double l = stack.pop();
                double f = stack.pop();
                if (c == '+') {
                    stack.push(f + l);
                }
                else if (c == '-') {
                    stack.push(f - l);
                }
                else if (c == '*') {
                    stack.push(f * l);
                }
                else if (c == '/') {
                    stack.push(f / l);
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
