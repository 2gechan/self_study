package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int m = Integer.valueOf(br.readLine());
        Stack<Character> front = new Stack<>(); // 커서 기준 앞
        Stack<Character> back = new Stack<>(); // 커서 기준 뒤
        for (char c : line.toCharArray()) {
            front.push(c);
        }

        StringTokenizer st;
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("L")) {
                if (front.isEmpty()) continue;
                back.push(front.pop());

            } else if (cmd.equals("D")) {
                if (back.isEmpty()) continue;
                front.push(back.pop());

            } else if (cmd.equals("B")) {
                if (front.isEmpty()) continue;
                front.pop();
            }
            else {
                char c = st.nextToken().charAt(0);
                front.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!front.isEmpty()) {
            back.push(front.pop());
        }
        while (!back.isEmpty()) {
            sb.append(back.pop());
        }
        System.out.println(sb.toString());
    }
}
