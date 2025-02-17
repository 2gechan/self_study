package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon12789 {

    static String solution(int[] arr) {
        String answer = "Nice";

        Stack<Integer> stack = new Stack<>();

        int out = 1;
        for (int x : arr) {
            if (x == out) {
                out++;
                while (!stack.isEmpty()) {
                    if (stack.peek() == out) {
                        stack.pop();
                        out++;
                    }
                    else break;
                }
                continue;
            }
            stack.push(x);
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == out) out++;
            else return "Sad";
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        System.out.println(solution(arr));
    }
}
