package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Silver2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = n; i > 0; i--) {
            deque.add(i);
        }

        boolean flag = true;
        while (deque.size() > 1) {

            int num = deque.pollLast();

            num = deque.pollLast();
            deque.push(num);

        }
        System.out.println(deque.pop());
    }
}
