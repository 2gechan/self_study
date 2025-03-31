package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String line = br.readLine();
            Stack<Character> front = new Stack<>();
            Stack<Character> back = new Stack<>();
            for (char c : line.toCharArray()) {
                if (c == '<') { // 커서 앞으로 이동, 스택 가장 위에 있는걸 뒤 스택으로 이동
                    if (!front.isEmpty()) {
                        back.push(front.pop());
                    }
                } else if (c == '>') { // 커서 뒤로 이동, 스택 가장 위에 있는 걸 앞 스택으로 이동
                    if (!back.isEmpty()) {
                        front.push(back.pop());
                    }
                } else if (c == '-') { // 백스페이스
                    if (!front.isEmpty()) front.pop();
                }
                else {
                    front.push(c);
                }
            }

            while (!front.isEmpty()) {
                back.push(front.pop());
            }
            while (!back.isEmpty()) {
                sb.append(back.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
