package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) stack.pop();
            else stack.push(arr[i]);
        }

        for (int i : stack) {
            sum += i;
        }
        System.out.println(sum);

    }
}
