package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.valueOf(br.readLine());
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] wear = br.readLine().split(" ");
                hm.put(wear[1], hm.getOrDefault(wear[1], 0) + 1);
            }

            for (String key : hm.keySet()) {
                hm.put(key, hm.get(key) + 1);
            }

            int result = 1;

            for (String key : hm.keySet()) {
                result *= hm.get(key);
            }

            sb.append(result - 1 + "\n");
        }

        System.out.println(sb.toString());
    }
}
