package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Silver1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        int cnt = 0;
        while (n-- > 0) {
            String line = br.readLine();

            HashSet<Character> hashSet = new HashSet<>();

            hashSet.add(line.charAt(0));
            boolean flag = false;
            for (int i = 1; i < line.length(); i++) {

                if (line.charAt(i) != line.charAt(i - 1)) {
                    if (hashSet.contains(line.charAt(i))) {
                        flag = true;
                        break;
                    }
                    hashSet.add(line.charAt(i));
                }
            }
            if (!flag) cnt++;
        }
        System.out.println(cnt);

    }
}
