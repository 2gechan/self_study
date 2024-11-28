package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Baekjoon9506 {
    static String solution(int num) {

        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) set.add(i);
        }
        int sum = 0;
        for (int key : set) {
            sum += key;
        }

        if (sum == num) {

            sb.append(num + " = ");
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 == list.size()) sb.append(list.get(i));
                else sb.append(list.get(i) + " + ");
            }
        } else sb.append(num + " is NOT perfect.");
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.valueOf(br.readLine());
            if (num == -1) break;
            System.out.println(solution(num));
        }
    }
}
