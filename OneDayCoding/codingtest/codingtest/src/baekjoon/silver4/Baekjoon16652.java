package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon16652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int cnt = 0;
        Long result = Long.parseLong(String.valueOf(Integer.MAX_VALUE));
        for (Long key : map.keySet()) {
            Integer i = map.get(key);

            if (i >= cnt) {
                Long tmp = key;
                if (i == cnt) tmp = Math.min(result, tmp);
                result = tmp;
                cnt = i;
            }
        }

        System.out.println(result);

    }
}
