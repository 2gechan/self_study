package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10773 {

    static int solution(int[] arr) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) stack.pop();
            else stack.push(arr[i]);
        }
        for (int x : stack) {
            answer += x;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.valueOf(br.readLine());
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        System.out.println(solution(arr));
    }
}
