package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bronze9506 {

    static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) set.add(i);
        }

        for (int key : set) {
            sum += key;
        }
        if (sum == n) {
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            sb.append(n).append(" = ");
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i)).append(" + ");
            }
            sb.append(list.get(list.size() - 1));
        } else sb.append(n).append(" is NOT perfect.");

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.valueOf(br.readLine());
            if (n == -1) break;
            System.out.println(solution(n));
        }
    }
}
