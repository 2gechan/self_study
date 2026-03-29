package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver1302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();

            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        int max = 0;
        String result = "";
        for (String key : map.keySet()) {
            if (map.get(key) >= max) {
                if (map.get(key) == max) {
                    if (key.compareTo(result) < 0) {
                        result = key;
                    }
                }
                else {
                    max = map.get(key);
                    result = key;
                }

            }
        }
        System.out.println(result);
    }
}
